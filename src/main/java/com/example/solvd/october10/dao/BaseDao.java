package com.example.solvd.october10.dao;

import java.util.List;

public interface BaseDao<T> {
    T getEntityById(int id);

    List<T> getEntities();

    void insert(T entity);

    void update(int index,T entity);

    void delete(int id);
}
