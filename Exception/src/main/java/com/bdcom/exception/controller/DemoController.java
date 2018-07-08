package com.bdcom.exception.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class DemoController {
    @RequestMapping("/zeroException")
    public int zeroException(){
        return 100/0;
    }
}
