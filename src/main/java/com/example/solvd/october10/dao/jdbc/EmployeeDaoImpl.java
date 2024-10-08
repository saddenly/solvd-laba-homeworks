package com.example.solvd.october10.dao.jdbc;

import com.example.solvd.october10.ConnectionPool;
import com.example.solvd.october10.dao.EmployeeDao;
import com.example.solvd.october10.model.Employee;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {
    static ConnectionPool connectionPool = ConnectionPool.create();
    private static final String SELECT_EMPLOYEE_BY_ID = "SELECT * FROM Employee WHERE employee_id=?";
    private static final String SELECT_ALL_EMPLOYEES = "SELECT * FROM Employee";
    private static final String INSERT_EMPLOYEE = "INSERT INTO Employee (employee_id, first_name, " +
            "last_name, email, role_id) VALUES (?,?,?,?,?)";
    private static final String UPDATE_EMPLOYEE = "UPDATE Employee SET first_name=?, last_name=?," +
            "email=?, role_id=? WHERE employee_id=?";
    private static final String DELETE_EMPLOYEE = "DELETE FROM Employee WHERE employee_id=?";


    @Override
    public Employee getEntityById(int id) {
        Employee employee = new Employee();
        Connection connection = null;
        try {
            connection = connectionPool.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_EMPLOYEE_BY_ID);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                setEmployee(resultSet, employee);
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            connectionPool.releaseConnection(connection);
        }
        return employee;
    }

    @Override
    public List<Employee> getEntities() {
        Connection connection = null;
        List<Employee> employees = new ArrayList<>();
        try {
            connection = connectionPool.getConnection();
            Statement statement = connection.createStatement();
            statement.execute(SELECT_ALL_EMPLOYEES);
            ResultSet resultSet = statement.getResultSet();
            while (resultSet.next()) {
                Employee employee = new Employee();
                setEmployee(resultSet, employee);
                employees.add(employee);
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            connectionPool.releaseConnection(connection);
        }
        return employees;
    }

    @Override
    public void insert(Employee entity) {
        Connection connection = null;
        try {
            connection = connectionPool.getConnection();
            PreparedStatement statement = connection.prepareStatement(INSERT_EMPLOYEE);
            statement.setInt(1, entity.getId());
            statement.setString(2, entity.getFirstName());
            statement.setString(3, entity.getLastName());
            statement.setString(4, entity.getEmail());
            statement.setInt(5, entity.getRoleId());
            statement.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            connectionPool.releaseConnection(connection);
        }
    }

    @Override
    public void update(int index, Employee entity) {
        Connection connection = null;
        try {
            connection = connectionPool.getConnection();
            PreparedStatement statement = connection.prepareStatement(UPDATE_EMPLOYEE);
            statement.setString(1, entity.getFirstName());
            statement.setString(2, entity.getLastName());
            statement.setString(3, entity.getEmail());
            statement.setInt(4, entity.getRoleId());
            statement.setInt(5, index);
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
            PreparedStatement statement = connection.prepareStatement(DELETE_EMPLOYEE);
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            connectionPool.releaseConnection(connection);
        }
    }

    private void setEmployee(ResultSet resultSet, Employee employee) throws SQLException {
        employee.setId(resultSet.getInt("employee_id"));
        employee.setFirstName(resultSet.getString("first_name"));
        employee.setLastName(resultSet.getString("last_name"));
        employee.setEmail(resultSet.getString("email"));
        employee.setRoleId(resultSet.getInt("role_id"));
    }
}
