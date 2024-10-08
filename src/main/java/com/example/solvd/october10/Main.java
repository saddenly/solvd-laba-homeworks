package com.example.solvd.october10;

import com.example.solvd.october10.dao.CustomerDao;
import com.example.solvd.october10.dao.EmployeeDao;
import com.example.solvd.october10.dao.jdbc.CustomerDaoImpl;
import com.example.solvd.october10.dao.jdbc.EmployeeDaoImpl;
import com.example.solvd.october10.model.Employee;

public class Main {
    public static void main(String[] args) {
        CustomerDao customerDao = new CustomerDaoImpl();
        EmployeeDao employeeDao = new EmployeeDaoImpl();
        employeeDao.insert(new Employee(1, "Rustem", "Andassov", "rustemandasov@gmail.com", 1));
        System.out.println(employeeDao.getEntities());
        System.out.println(customerDao.getEntities());
    }
}
