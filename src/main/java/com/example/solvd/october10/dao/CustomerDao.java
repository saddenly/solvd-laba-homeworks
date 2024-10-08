package com.example.solvd.october10.dao;

import com.example.solvd.october10.model.Customer;

import java.util.List;

public interface CustomerDao extends BaseDao<Customer> {
    @Override
    Customer getEntityById(int id);

    @Override
    List<Customer> getEntities();

    @Override
    void insert(Customer entity);

    @Override
    void update(int index, Customer entity);

    @Override
    void delete(int id);
}
