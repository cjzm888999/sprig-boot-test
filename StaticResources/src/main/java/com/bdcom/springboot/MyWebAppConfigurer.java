package com.bdcom.springboot;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MyWebAppConfigurer
        extends WebMvcConfigurerAdapter {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // registry.addResourceHandler("/myres/**").addResourceLocations("classpath:/myres/");//http://localhost:8080/myres/P8510.png
        //registry.addResourceHandler("/my/**").addResourceLocations("classpath:/myres/");//http://localhost:8080/my/P8510.png
        //registry.addResourceHandler("/**").addResourceLocations("classpath:/myres/").addResourceLocations("classpath:/public/");
        // (/** 会覆盖系统默认的配置)   http://localhost:8080/P8510.png
        // 可以直接使用addResourceLocations 指定磁盘绝对路径，同样可以配置多个位置，注意路径写法需要加上file:
        registry.addResourceHandler("/my/**").addResourceLocations("file:E:/Resources/");//http://localhost:8080/my/Resources.txt
        super.addResourceHandlers(registry);
    }

}