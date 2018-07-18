package com.bdcom.cn.app;

import com.bdcom.cn.util.SpringUtil2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BeanApp {
    /**注册SpringUtil2 与BeanApp不在同一包或子包下
     * 这里为了和上一个冲突，所以方面名为：springUtil2
     *
     */
    @Bean
    public SpringUtil2 springUtil2(){
        return new SpringUtil2();
    }

    public static void main(String args[]){
        SpringApplication.run(BeanApp.class,args);
    }
}
