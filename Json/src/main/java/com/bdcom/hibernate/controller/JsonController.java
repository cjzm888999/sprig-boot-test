package com.bdcom.hibernate.controller;

import com.bdcom.bean.Demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/json")
public class JsonController{
@RequestMapping("/getDemo")
public Demo getDemo(){
    Demo demo=new Demo();
    demo.setId(1);
    demo.setName("test8");
    return demo;

}

}
