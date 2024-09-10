package com.arcmine.controller;

import com.arcmine.domain.ResponseResult;
import com.arcmine.domain.User;
import com.arcmine.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class RegisterController {

    @Autowired
    private RegisterService registerService;

    @PostMapping("/register")
    public ResponseResult register(@RequestBody User user) {
        try {
            Integer register = registerService.register(user);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseResult(300, "注册失败，账号已存在");
        }
            return new ResponseResult(200, "注册成功");
    }
}
