package com.bdcom.cn.controller;

import com.bdcom.cn.Student2Setting;
import com.bdcom.cn.StudentSetting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class CustomController {
    @Autowired
    public Student2Setting student2;
    @Autowired
    public StudentSetting student;
    @RequestMapping("/test")
    public @ResponseBody String test(){
    System.out.println("Student.name:"+student.name);
    System.out.println("Student.gender:"+student.gender);
    System.out.println("Student.age:"+student.age);
    System.out.println("Student2.name:"+student2.name);
    System.out.println("Student2.gender:"+student2.gender);
    System.out.println("Student2.age:"+student2.age);
     return "OK";
    }
    @RequestMapping("/testPage")
    public String testPage(Map<String,String> map){
        map.put("name",student.name);
        map.put("gender",student.gender);
        map.put("age",student.age+"");
        map.put("name2",student2.name);
        map.put("gender2",student2.gender);
        map.put("age2",student2.age+"");
        return "customProperties";
    }
}
