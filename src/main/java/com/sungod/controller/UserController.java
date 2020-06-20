package com.sungod.controller;

import com.sungod.entity.User;
import com.sungod.service.impl.UserServiceImpl;
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
