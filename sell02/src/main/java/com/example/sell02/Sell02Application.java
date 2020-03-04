package com.example.sell02;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.example.sell02.dao")
@SpringBootApplication
public class Sell02Application {

    public static void main(String[] args) {
        SpringApplication.run(Sell02Application.class, args);
    }

}
