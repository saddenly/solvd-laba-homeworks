package com.example.solvd.october10.dao;

import com.example.solvd.october10.model.Employee;

import java.util.List;

public interface EmployeeDao extends BaseDao<Employee>{
    @Override
    Employee getEntityById(int id);

    @Override
    List<Employee> getEntities();

    @Override
    void insert(Employee entity);

    @Override
    void update(int index, Employee entity);

    @Override
    void delete(int id);
}
