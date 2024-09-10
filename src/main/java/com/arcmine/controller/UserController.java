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
        User user = userService.getUserByAccount(account);
        return user;
    }

    @PostMapping("/changeinfo")
    @ResponseBody
    public ResponseResult changeInfo(@RequestBody User user) {
        try {
            Integer changeUser = userService.changeInfo(user);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseResult(300,"修改失败");
        }
        return new ResponseResult(200,"修改成功");
    }
}
