package com.example.shirodemo.cn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @RequestMapping("/getUserById")
    @ResponseBody
    public Object getUserById(){

        return null;
    }
}
