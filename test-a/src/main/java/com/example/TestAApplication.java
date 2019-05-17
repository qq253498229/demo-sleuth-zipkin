package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author wangbin
 */
@SpringBootApplication
@EnableFeignClients
public class TestAApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestAApplication.class, args);
    }

}
