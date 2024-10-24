package com.example.solvd.october10.dao;

import com.example.solvd.october10.model.Employee;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface EmployeeDao extends BaseDao<Employee>{
    @Select("select * from production.employee where employee_id = #{id}")
    @Results(value = {
            @Result(property = "id", column = "employee_id"),
            @Result(property = "firstName", column = "first_name"),
            @Result(property = "lastName", column = "last_name"),
            @Result(property = "roleId", column = "role_id")})
    @Override
    Employee getEntityById(int id);

    @Select("select * from production.employee")
    @Results(value = {
            @Result(property = "id", column = "employee_id"),
            @Result(property = "firstName", column = "first_name"),
            @Result(property = "lastName", column = "last_name"),
            @Result(property = "roleId", column = "role_id")})
    @Override
    List<Employee> getEntities();

    @Insert("insert into production.employee(employee_id, first_name, last_name, email, role_id) " +
            "values(#{id}, #{firstName}, #{lastName}, #{email}, #{roleId})")
    @Override
    void insert(Employee entity);

    @Update("update production.employee " +
            "set first_name = #{firstName}, last_name = #{lastName}, " +
            "email = #{email}, role_id = #{role_id} " +
            "where employee_id = #{id}")
    @Override
    void update(int index, Employee entity);

    @Delete("delete from production.employee " +
            "where employee_id = #{id}")
    @Override
    void delete(int id);
}
