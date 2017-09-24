package com.zhangfengbin.service.impl;

import com.zhangfengbin.mapper.UserMapper;
import com.zhangfengbin.po.User;
import com.zhangfengbin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(int i) {
        User user = userMapper.selectByPrimaryKey(i);

        return user;
    }
}
