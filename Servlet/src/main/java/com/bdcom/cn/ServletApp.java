package com.bdcom.cn;

import com.bdcom.cn.servlet.MyServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@ServletComponentScan
public class ServletApp {
    public static void main(String args[]){
        SpringApplication.run(ServletApp.class,args);
    }

    /**
     * 使用代码注册Servlet（不需要@ServletComponentScan注解）
     */
   /* @Bean
    public ServletRegistrationBean servletRegistrationBean(){
        return new ServletRegistrationBean(new MyServlet(),"/servlet/*");
        //ServletName默认值为首字母小写，即myServlet

    }*/
}
