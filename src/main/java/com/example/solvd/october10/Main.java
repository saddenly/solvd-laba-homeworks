package com.example.solvd.october10;

import com.example.solvd.october10.dao.CustomerDao;
import com.example.solvd.october10.dao.EmployeeDao;
import com.example.solvd.october10.model.Customer;
import com.example.solvd.october10.model.Employee;
import com.example.solvd.october10.service.CustomerService;
import com.example.solvd.october10.service.EmployeeService;

import java.sql.Date;

public class Main {
    public static void main(String[] args) {
        CustomerDao customerDao = CustomerService.getCustomerDao();

        System.out.println(customerDao.getEntities());

        System.out.println(customerDao.getEntityById(2));

        Customer customer = new Customer(3, "Gabriela", "Solis", "g.solis@gmail.com",
                "567935578", "Wall Street 4", new Date(19911010L));
        customerDao.insert(customer);

        customer.setAddress("Wall Street 10");
        customerDao.update(3, customer);

        customerDao.delete(3);

        EmployeeDao employeeDao = EmployeeService.getEmployeeDao();


        System.out.println(employeeDao.getEntities());

        System.out.println(employeeDao.getEntityById(2));

        Employee employee = new Employee(2, "Angsar", "Utebayev", "a.utebayev@gmail.com", 1);
        employeeDao.insert(employee);

        employee.setEmail("a.utebayev@outlook.com");
        employeeDao.update(3, employee);

        employeeDao.delete(3);
    }
}
