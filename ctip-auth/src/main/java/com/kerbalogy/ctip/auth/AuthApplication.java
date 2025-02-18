package com.kerbalogy.ctip.auth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author yaozongqing@outlook.com
 * @description
 * @date 2023-07-10
 **/
@SpringBootApplication
@MapperScan("com.kerbalogy.ctip.auth.vanilla.mapper")
public class AuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthApplication.class, args);
    }

}
