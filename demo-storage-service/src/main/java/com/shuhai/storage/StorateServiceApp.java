package com.shuhai.storage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 描述：
 *
 * @author 含光
 * @email jarvan_best@163.com
 * @date 2021/2/25 4:24 下午
 * @company 数海掌讯
 */
@EnableFeignClients
@EnableDiscoveryClient
@MapperScan({"com.shuhai.storage.mapper"})
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class StorateServiceApp {
    public static void main(String[] args) {
        SpringApplication.run(StorateServiceApp.class, args);
    }
}

