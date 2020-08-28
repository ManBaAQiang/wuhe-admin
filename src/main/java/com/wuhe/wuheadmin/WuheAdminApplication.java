package com.wuhe.wuheadmin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//@MapperScan("com.wuhe.wuheadmin.mapper") //扫描的mapper
@EnableAutoConfiguration
@SpringBootApplication
public class WuheAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(WuheAdminApplication.class, args);
    }

}
