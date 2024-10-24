package com.example.solvd.october10;

import com.example.solvd.october10.dao.CustomerDao;
import com.example.solvd.october10.dao.EmployeeDao;
import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

import java.util.ResourceBundle;

public class MyBatisConf {
    public static SqlSessionFactory buildSqlSessionFactory() {
        ResourceBundle rb = ResourceBundle.getBundle("database");
        PooledDataSource dataSource =
                new PooledDataSource(rb.getString("driver"), rb.getString("url"), rb.getString("username"), rb.getString("password"));
        Environment environment =
                new Environment("Development", new JdbcTransactionFactory(), dataSource);

        Configuration configuration = new Configuration(environment);
        configuration.addMapper(CustomerDao.class);
        configuration.addMapper(EmployeeDao.class);

        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        return builder.build(configuration);
    }
}
