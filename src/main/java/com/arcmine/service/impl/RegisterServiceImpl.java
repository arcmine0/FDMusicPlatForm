package com.arcmine.service.impl;

import com.arcmine.domain.User;
import com.arcmine.mapper.RegisterMapper;
import com.arcmine.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterServiceImpl implements RegisterService {

    @Autowired
    private RegisterMapper registerMapper;


    @Override
    public Integer register(User user) {
        Integer register = registerMapper.register(user);
        return register;
    }
}
