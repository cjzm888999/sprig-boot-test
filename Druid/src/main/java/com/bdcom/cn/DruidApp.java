package com.bdcom.cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
//@ServletComponentScan
public class DruidApp {
    public static void main(String args[]){
        SpringApplication.run(DruidApp.class,args);
        //http://127.0.0.1:8080/druid/index.html
        //http://127.0.0.1:8080/druid2/index.html
    }
}
