package com.example.solvd.october10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class ConnectionPool {
    private static String url;
    private static String user;
    private static String password;
    private static final List<Connection> connectionPool = new ArrayList<>();
    private static final List<Connection> usedConnectionPool = new ArrayList<>();
    private static int INITIAL_POOL_SIZE = 5;

    public static ConnectionPool create() {
        ResourceBundle resources = ResourceBundle.getBundle("database");

        url = resources.getString("url");
        user = resources.getString("user");
        password = resources.getString("password");

        for (int i = 0; i < INITIAL_POOL_SIZE; i++) {
            connectionPool.add(createConnection(url, user, password));
        }
        return new ConnectionPool();
    }

    private ConnectionPool(){
    }

    public Connection getConnection() {
        if (connectionPool.isEmpty()) {
            synchronized (usedConnectionPool) {
                try {
                    connectionPool.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        Connection connection = connectionPool
                .removeLast();
        usedConnectionPool.add(connection);
        return connection;
    }

    public boolean releaseConnection(Connection connection) {
        connectionPool.add(connection);
        synchronized (connectionPool) {
            connectionPool.notifyAll();
        }
        return usedConnectionPool.remove(connection);
    }

    private static Connection createConnection(String url, String user, String password) {
        Connection connection;
        try {
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }

    public int getSize() {
        return connectionPool.size() + usedConnectionPool.size();
    }
}
