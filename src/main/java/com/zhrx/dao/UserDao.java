package com.zhrx.dao;


import com.zhrx.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    List<User> findUserByUserId(String id);
}
