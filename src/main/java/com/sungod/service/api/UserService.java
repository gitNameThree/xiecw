package com.sungod.service.api;

import com.sungod.entity.User;

import java.util.List;

public interface UserService {
    /**
     * 根据用户id查找用户
     * @param id 用户Id
     * @return
     */
    List<User> findUserByUserId(String id);
}
