package com.sungod.service.impl;

import com.sungod.entity.User;
import com.sungod.service.api.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public List<User> findUserByUserId(String id) {
        return null;
    }
}
