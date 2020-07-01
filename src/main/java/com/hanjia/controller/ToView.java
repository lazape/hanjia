package com.hanjia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/to")
public class ToView {

    @RequestMapping("/index")
    public String toIndex(){
        return "index";
    }
}
