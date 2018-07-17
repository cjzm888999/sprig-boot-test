package com.bdcom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloJspApp {
    public static void main(String args[]){
        SpringApplication.run(HelloJspApp.class,args );
        System.out.println(System.getProperty("user.dir"));

    }
}
