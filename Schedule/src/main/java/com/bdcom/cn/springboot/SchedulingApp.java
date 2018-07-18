package com.bdcom.cn.springboot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SchedulingApp {
    public static void main(String args[]){
        SpringApplication.run(SchedulingApp.class,args );
    }
}
