package com.bdcom.bootstart;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class App_Helloword {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello world!";
    }
    @RequestMapping("/helloword")
    public String helloword(){
        return "Hello world!";
    }

    public static void main(String[] args) {
        SpringApplication.run(App_Helloword.class, args);
    }
}