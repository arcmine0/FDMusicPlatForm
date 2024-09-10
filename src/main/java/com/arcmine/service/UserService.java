package com.arcmine.service;

import com.arcmine.domain.User;

public interface UserService {
    User getUserByAccount(String account);
    Integer changeInfo(User user);
}
