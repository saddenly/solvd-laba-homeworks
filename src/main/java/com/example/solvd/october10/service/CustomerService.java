package com.example.solvd.october10.service;

import com.example.solvd.october10.dao.CustomerDao;
import com.example.solvd.october10.dao.jdbc.CustomerDaoImpl;

import java.util.ResourceBundle;

public class CustomerService {

    public static CustomerDao getCustomerDao() {
        ResourceBundle rb = ResourceBundle.getBundle("database");
        if (rb.getString("type").equals("jdbc"))
            return new CustomerDaoImpl();
        else
            return new com.example.solvd.october10.dao.mybatis.CustomerDaoImpl();

    }
}
