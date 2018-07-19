package com.bdcom.cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class Filter_ListenerApp {
    public static void main(String args[]){
        SpringApplication.run(Filter_ListenerApp.class,args);
    }
}
