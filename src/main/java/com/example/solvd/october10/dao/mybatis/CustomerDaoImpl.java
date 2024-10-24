package com.example.solvd.october10.dao.mybatis;

import com.example.solvd.october10.MyBatisConf;
import com.example.solvd.october10.dao.CustomerDao;
import com.example.solvd.october10.model.Customer;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class CustomerDaoImpl implements CustomerDao {
    private static final SqlSessionFactory sqlSessionFactory =
            MyBatisConf.buildSqlSessionFactory();

    @Override
    public Customer getEntityById(int id) {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            return session.selectOne("com.example.solvd.october10.dao.CustomerDao.getEntityById", id);
        }
    }

    @Override
    public List<Customer> getEntities() {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            return session.selectList("com.example.solvd.october10.dao.CustomerDao.getEntities");
        }
    }

    @Override
    public void insert(Customer entity) {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            session.insert("com.example.solvd.october10.dao.CustomerDao.insert", entity);
            session.commit();
        }
    }

    @Override
    public void update(int index, Customer entity) {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            session.update("com.example.solvd.october10.dao.CustomerDao.update", entity);
            session.commit();
        }
    }

    @Override
    public void delete(int id) {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            session.delete("com.example.solvd.october10.dao.CustomerDao.delete", id);
            session.commit();
        }
    }
}
