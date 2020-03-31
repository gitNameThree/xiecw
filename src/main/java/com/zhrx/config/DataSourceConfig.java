package com.zhrx.config;

import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {
    @Bean
    public DataSource getDataSource(){
        PooledDataSource dataSource = new PooledDataSource();

        dataSource.setDriver("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/bd_n?serverTimezone=UTC");
        dataSource.setUsername("root");
        dataSource.setPassword("000000");
        return dataSource;

    }
}
