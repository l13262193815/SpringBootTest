package com.java.service;

import com.java.pojo.User;

import java.util.List;

public interface UserService {
    User queryUserById(Long i);

    void deleteById(Long id);

    List<User> queryAllUser();
}
