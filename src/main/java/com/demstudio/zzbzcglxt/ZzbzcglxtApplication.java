package com.demstudio.zzbzcglxt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.demstudio.zzbzcglxt.repository")
@SpringBootApplication
public class ZzbzcglxtApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZzbzcglxtApplication.class, args);
    }

}
