package com.arcmine.controller;

import com.arcmine.domain.ResponseResult;
import com.arcmine.domain.User;
import com.arcmine.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @RequestMapping("/info")
    @ResponseBody
    public User information(@RequestParam("account") String account) {
        User user;
        try {
            user = userService.getUserByAccount(account);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("获取用户信息异常");
        }
        if(user == null) {
            throw new RuntimeException("获取用户信息失败");
        }
        return user;
    }

    @PostMapping("/changeInfo")
    @ResponseBody
    public ResponseResult changeInfo(@RequestBody User user) {
        Integer changeUser;
        try {
            changeUser = userService.changeInfo(user);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("修改信息异常");
        }
        if (changeUser != 1) {
            throw new RuntimeException("修改失败");
        }
        return new ResponseResult(200, "修改成功");
    }
}
