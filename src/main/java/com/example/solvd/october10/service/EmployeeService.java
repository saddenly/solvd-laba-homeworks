package com.example.solvd.october10.service;

import com.example.solvd.october10.dao.EmployeeDao;
import com.example.solvd.october10.dao.jdbc.EmployeeDaoImpl;

import java.util.ResourceBundle;

public class EmployeeService {
    public static EmployeeDao getEmployeeDao() {
        ResourceBundle rb = ResourceBundle.getBundle("database");
        if (rb.getString("type").equals("jdbc"))
            return new EmployeeDaoImpl();
        else
            return new com.example.solvd.october10.dao.mybatis.EmployeeDaoImpl();
    }
}
