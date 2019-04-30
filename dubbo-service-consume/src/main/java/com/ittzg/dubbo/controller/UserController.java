package com.ittzg.dubbo.controller;

import com.ittzg.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @email: tazhigang095@163.com
 * @author: ittzg
 * @date: 2019/4/25 23:40
 * @describe:
 */
@RestController
@RequestMapping(value = "user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping(value = "login")
    public String login(){
        return userService.login();
    }

}
