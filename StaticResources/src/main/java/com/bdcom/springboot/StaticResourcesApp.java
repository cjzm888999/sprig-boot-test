package com.bdcom.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StaticResourcesApp {
    public static void main(String args[]){
        SpringApplication.run(StaticResourcesApp.class,args );
        System.out.println(System.getProperty("user.dir"));

    }
}
