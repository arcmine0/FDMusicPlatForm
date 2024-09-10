package com.arcmine.service.impl;

import com.arcmine.domain.User;
import com.arcmine.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements com.arcmine.service.UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserByAccount(String account) {
        User user = userMapper.getUserByAccount(account);
        return user;
    }

    @Override
    public Integer changeInfo(User user) {
        Integer changeUser = userMapper.changeInfo(user);
        return changeUser;
    }
}
