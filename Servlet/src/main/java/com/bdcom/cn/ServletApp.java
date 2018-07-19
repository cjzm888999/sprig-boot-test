package com.bdcom.cn;

import com.bdcom.cn.servlet.MyServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.DispatcherServlet;

@SpringBootApplication
@ServletComponentScan
public class ServletApp {
    public static void main(String args[]){
        SpringApplication.run(ServletApp.class,args);
    }

    /**
     * 使用代码注册Servlet（不需要@ServletComponentScan注解）
     */
    @Bean
    public ServletRegistrationBean servletRegistrationBean(MyServlet myServlet){
        //return new ServletRegistrationBean(new MyServlet(),"/servlet/*");
        return new ServletRegistrationBean(myServlet,"/servlet/*");
        //ServletName默认值为首字母小写，即myServlet

    }

    /**
     * 修改DispatcherServlet默认配置
     *
     * @param dispatcherServlet
     * @return

     */
    @Bean
    public ServletRegistrationBean dispatcherRegistration(DispatcherServlet dispatcherServlet) {
        ServletRegistrationBean registration = new ServletRegistrationBean(dispatcherServlet);
        registration.getUrlMappings().clear();
        registration.addUrlMappings("*.do");
        registration.addUrlMappings("*.json");
        return registration;
    }
}
