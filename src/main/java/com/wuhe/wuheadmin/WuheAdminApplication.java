package com.wuhe.wuheadmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication
public class WuheAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(WuheAdminApplication.class, args);
    }

}
