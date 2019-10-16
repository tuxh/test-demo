package com.example.shirodemo.cn.controller;

import com.example.shirodemo.cn.services.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping("/getUserById")
    @ResponseBody
    public Object getUserById(@RequestParam("id") String id){
        return userInfoService.getUserInfoById(id);
    }


}
