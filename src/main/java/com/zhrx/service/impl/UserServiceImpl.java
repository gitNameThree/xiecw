package com.zhrx.service.impl;

import com.zhrx.dao.UserDao;
import com.zhrx.entity.User;
import com.zhrx.service.api.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    public List<User> findUserByUserId(String id) {
        return userDao.findUserByUserId(id);
    }
}
