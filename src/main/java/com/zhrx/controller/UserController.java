package com.zhrx.controller;

import com.zhrx.entity.User;
import com.zhrx.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserServiceImpl userServiceImpl;

    @GetMapping("/findUserByUserId")
    public List<User> findUserByUserId(String id) {
        return userServiceImpl.findUserByUserId(id);
    }
}
