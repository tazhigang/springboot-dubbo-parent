package com.ittzg.dubbo.service.impl;

import com.ittzg.dubbo.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @email: tazhigang095@163.com
 * @author: ittzg
 * @date: 2019/4/25 23:30
 * @describe:
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public String login() {
        return "login successfully......";
    }
}
