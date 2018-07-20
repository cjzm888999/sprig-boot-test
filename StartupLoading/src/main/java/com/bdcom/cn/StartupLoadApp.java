package com.bdcom.cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StartupLoadApp {
    public static void main(String args[]){
        //SpringApplication.run(StartupLoadApp.class,args);
        SpringApplication.run(StartupLoadApp.class,new String[]{"启动参数1","启动参数2","启动参数3"});
    }
}
