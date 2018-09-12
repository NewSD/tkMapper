package com.tian.tkmapper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.tian.tkmapper.tk.dao")//mapper接口的路径
public class TkmapperApplication {

    public static void main(String[] args) {
        SpringApplication.run(TkmapperApplication.class, args);
    }
}
