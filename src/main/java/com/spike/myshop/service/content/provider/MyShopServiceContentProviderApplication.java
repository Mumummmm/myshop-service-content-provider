package com.spike.myshop.service.content.provider;

import com.alibaba.dubbo.container.Main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication(scanBasePackages = "com.spike.myshop")
@EnableHystrix
@EnableHystrixDashboard
@MapperScan(basePackages = "com.spike.myshop.commons.mapper")
@EnableTransactionManagement
public class MyShopServiceContentProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyShopServiceContentProviderApplication.class, args);
        Main.main(args);
    }
}
