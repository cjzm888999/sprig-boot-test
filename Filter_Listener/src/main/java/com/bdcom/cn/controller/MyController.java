package com.bdcom.cn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
public class MyController {
    @RequestMapping("/index")
  public String index(HttpServletRequest req, Map<String,String>map){
        String sessionid=req.getSession().getId();
        map.put("sessionid",sessionid);
      return "index";
  }
}
