package com.vlgu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan(basePackages = "com.vlgu.mapper")
@SpringBootApplication
public class CarOwnerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarOwnerApplication.class, args);
    }

}
