package com.bdcom.cn.startup2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.bdcom.cn.startup1","com.bdcom.cn.startup2"})
public class CustomScanPackageApp {
    public static void main(String args[]){
        SpringApplication.run(CustomScanPackageApp.class,args);
    }
}
