package com.bdcom.cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({Student2Setting.class})
public class CustomPropertiesApp {
    public static void main(String args[]){
        SpringApplication.run(CustomPropertiesApp.class,args);
    }
}
