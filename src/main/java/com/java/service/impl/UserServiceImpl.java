package com.java.service.impl;

import com.java.mapper.UserMapper;
import com.java.pojo.User;
import com.java.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    /**
     * 根据编号查询用户
     * @param i
     * @return
     */
    @Override
    public User queryUserById(Long i) {
        return userMapper.selectByPrimaryKey(i);
    }

    @Override
    public void deleteById(Long id) {
        userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<User> queryAllUser() {
        return userMapper.selectAll();
    }
}
