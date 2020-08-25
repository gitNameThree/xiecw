package com.sungod.config;

import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    @Bean
    public DataSource getDataSource() {
        PooledDataSource dataSource = new PooledDataSource();
        dataSource.setDriver("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/bd_n?serverTimezone=UTC");
        dataSource.setUsername("root");
        dataSource.setPassword("000000");
        return dataSource;
    }

    @Bean
    public ThreadPoolTaskScheduler threadPoolTaskScheduler() {
        return new ThreadPoolTaskScheduler();
    }

    /**
     * 连接appium 的客户端
     * @return
     */
    @Bean
    public DesiredCapabilities getAppiumConnect(){
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("deviceName", "OPPO R17 Pro");
        caps.setCapability("appPackage", "com.ss.android.ugc.aweme");
        caps.setCapability("appActivity", ".main.MainActivity");
        return caps;

    }

}
