package com.bdcom.cn.startupload;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;

@Component
@Order(value = 3)
public class MyStartupRun3 implements CommandLineRunner {
    @Override
    public void run(String... strings) throws Exception {
        System.out.println(">>>>>>>>>>>>>>>服务启动执行，执行加载数据等操作 3----打印启动参数<<<<<<<<<<<<<");
        System.out.println(Arrays.asList(strings));
    }
}
