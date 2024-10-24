package com.example.solvd.october10.dao.mybatis;

import com.example.solvd.october10.MyBatisConf;
import com.example.solvd.october10.dao.EmployeeDao;
import com.example.solvd.october10.model.Employee;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {
    private static final SqlSessionFactory sqlSessionFactory =
            MyBatisConf.buildSqlSessionFactory();

    @Override
    public Employee getEntityById(int id) {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            return session.selectOne("com.example.solvd.october10.dao.EmployeeDao.getEntityById", id);
        }
    }

    @Override
    public List<Employee> getEntities() {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            return session.selectList("com.example.solvd.october10.dao.EmployeeDao.getEntities");
        }
    }

    @Override
    public void insert(Employee entity) {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            session.insert("com.example.solvd.october10.dao.EmployeeDao.insert", entity);
            session.commit();
        }
    }

    @Override
    public void update(int index, Employee entity) {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            session.update("com.example.solvd.october10.dao.CustomerDao.update", entity);
            session.commit();
        }
    }

    @Override
    public void delete(int id) {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            session.delete("com.example.solvd.october10.dao.EmployeeDao.delete", id);
            session.commit();
        }
    }
}
