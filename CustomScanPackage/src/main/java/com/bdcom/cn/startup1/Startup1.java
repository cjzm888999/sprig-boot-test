package com.bdcom.cn.startup1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Startup1 implements CommandLineRunner {
    @Override
    public void run(String... strings) throws Exception {
        System.out.println("启动信息1");
    }
}
