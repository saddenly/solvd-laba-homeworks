package com.example.solvd.october10.dao.jdbc;

import com.example.solvd.october10.ConnectionPool;
import com.example.solvd.october10.dao.CustomerDao;
import com.example.solvd.october10.model.Customer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerDaoImpl implements CustomerDao {
    static ConnectionPool connectionPool = ConnectionPool.create();
    private static final String SELECT_CUSTOMER_BY_ID = "SELECT * FROM Customer WHERE id = ?";
    private static final String SELECT_ALL_CUSTOMERS = "SELECT * FROM Customer";
    private static final String INSERT_CUSTOMER = "INSERT INTO Customer(customer_id, first_name, last_name, email," +
            "phone, address, date_of_birth) VALUES(?,?,?,?,?,?,?)";
    private static final String UPDATE_CUSTOMER = "UPDATE customer SET first_name=?, last_name=?, email=?, " +
            "phone=?, address=?, date_of_birth=? WHERE customer_id=?";
    private static final String DELETE_CUSTOMER = "DELETE FROM customer WHERE customer_id=?";

    @Override
    public Customer getEntityById(int id) {
        Customer customer = new Customer();
        Connection connection = null;
        try {
            connection = connectionPool.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_CUSTOMER_BY_ID);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                setCustomer(resultSet, customer);
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            connectionPool.releaseConnection(connection);
        }
        return customer;
    }

    @Override
    public List<Customer> getEntities() {
        Connection connection = null;
        List<Customer> customers = new ArrayList<>();
        try {
            connection = connectionPool.getConnection();
            Statement statement = connection.createStatement();
            statement.execute(SELECT_ALL_CUSTOMERS);
            ResultSet resultSet = statement.getResultSet();
            while (resultSet.next()) {
                Customer customer = new Customer();
                setCustomer(resultSet, customer);
                customers.add(customer);
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            connectionPool.releaseConnection(connection);
        }
        return customers;
    }

    @Override
    public void insert(Customer entity) {
        Connection connection = null;
        try {
            connection = connectionPool.getConnection();
            PreparedStatement statement = connection.prepareStatement(INSERT_CUSTOMER);
            statement.setInt(1, entity.getId());
            statement.setString(2, entity.getFirstName());
            statement.setString(3, entity.getLastName());
            statement.setString(4, entity.getEmail());
            statement.setString(5, entity.getPhone());
            statement.setString(6, entity.getAddress());
            statement.setDate(7, entity.getDateOfBirth());
            statement.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            connectionPool.releaseConnection(connection);
        }
    }

    @Override
    public void update(int index, Customer entity) {
        Connection connection = null;
        try {
            connection = connectionPool.getConnection();
            PreparedStatement statement = connection.prepareStatement(UPDATE_CUSTOMER);
            statement.setString(1, entity.getFirstName());
            statement.setString(2, entity.getLastName());
            statement.setString(3, entity.getEmail());
            statement.setString(4, entity.getPhone());
            statement.setString(5, entity.getAddress());
            statement.setDate(6, entity.getDateOfBirth());
            statement.setInt(7, index);
            statement.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            connectionPool.releaseConnection(connection);
        }
    }

    @Override
    public void delete(int id) {
        Connection connection = null;
        try {
            connection = connectionPool.getConnection();
            PreparedStatement statement = connection.prepareStatement(DELETE_CUSTOMER);
            statement.setInt(1, id);
            statement.execute();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            connectionPool.releaseConnection(connection);
        }
    }

    private void setCustomer(ResultSet resultSet, Customer customer) throws SQLException {
        customer.setId(resultSet.getInt("customer_id"));
        customer.setFirstName(resultSet.getString("first_name"));
        customer.setLastName(resultSet.getString("last_name"));
        customer.setEmail(resultSet.getString("email"));
        customer.setAddress(resultSet.getString("address"));
        customer.setPhone(resultSet.getString("phone"));
        customer.setDateOfBirth(resultSet.getDate("date_of_birth"));
    }
}
