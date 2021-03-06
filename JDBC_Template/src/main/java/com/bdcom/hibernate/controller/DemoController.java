package com.bdcom.hibernate.controller;

import javax.annotation.Resource;

import com.bdcom.hibernate.bean.Demo;
import com.bdcom.hibernate.service.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/jpa")
public class DemoController {
@Resource
private DemoService demoService;

/**
 * 测试保存数据方法.
 * @return
 */
@RequestMapping("/save")
public String save(){
        Demo d = new Demo();
        d.setName("Angel");
        demoService.save(d);//保存数据.
        return"ok.DemoController.save";
        }

        //地址：http://127.0.0.1:8080/jpa/getById?id=1
        @RequestMapping("/getById")
        public Demo getById(long id){
                return demoService.getById(id);
        }

}