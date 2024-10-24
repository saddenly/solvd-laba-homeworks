package com.example.solvd.october10.dao;

import com.example.solvd.october10.model.Customer;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface CustomerDao extends BaseDao<Customer> {
    @Select("select * from production.Customer where customer_id = #{id}")
    @Results(value = {
            @Result(property = "id", column = "customer_id"),
            @Result(property = "firstName", column = "first_name"),
            @Result(property = "lastName", column = "last_name"),
            @Result(property = "dateOfBirth", column = "date_of_birth")})
    @Override
    Customer getEntityById(int id);

    @Select("select * from production.customer")
    @Results(value = {
            @Result(property = "id", column = "customer_id"),
            @Result(property = "firstName", column = "first_name"),
            @Result(property = "lastName", column = "last_name"),
            @Result(property = "dateOfBirth", column = "date_of_birth")})
    @Override
    List<Customer> getEntities();

    @Insert("insert into production.customer(customer_id, first_name, last_name," +
            " email, phone, address, date_of_birth) values(#{id}, #{firstName}, " +
            "#{lastName}, #{email}, #{phone}, #{address}, #{dateOfBirth})")
    @Override
    void insert(Customer entity);

    @Update("update production.customer " +
            "set first_name = #{firstName}, last_name = #{lastName}," +
            "email = #{email}, phone = #{phone}, address = #{address}," +
            "date_of_birth = #{dateOfBirth} " +
            "where customer_id = #{id}")
    @Override
    void update(int index, Customer entity);

    @Delete("delete from production.customer where customer_id = #{id}")
    @Override
    void delete(int id);
}
