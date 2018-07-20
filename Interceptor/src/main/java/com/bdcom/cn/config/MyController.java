package com.bdcom.cn.config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@Controller
public class MyController {
    @RequestMapping("/index")
    public String index(HttpServletRequest req, HttpServletResponse res, Map<String,String> map){
        return "index";
    }
}
