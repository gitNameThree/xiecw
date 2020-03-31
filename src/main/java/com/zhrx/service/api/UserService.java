package com.zhrx.service.api;

import com.zhrx.entity.User;

import java.util.List;

public interface UserService {
    /**
     * 根据用户id查找用户
     * @param id 用户Id
     * @return
     */
    List<User> findUserByUserId(String id);
}
