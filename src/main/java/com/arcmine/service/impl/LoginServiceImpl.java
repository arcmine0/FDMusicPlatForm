package com.arcmine.service.impl;

import com.arcmine.domain.User;
import com.arcmine.mapper.LoginMapper;
import com.arcmine.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginMapper loginMapper;

    @Override
    public User login(User user) {
        User loginUser = loginMapper.login(user);
        return loginUser;
    }
}
