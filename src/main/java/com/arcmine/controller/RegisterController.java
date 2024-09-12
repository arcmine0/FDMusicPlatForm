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
        Integer register;
        try {
            register = registerService.register(user);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("注册异常");
        }
        if (register != 1) {
            throw new RuntimeException("注册失败");
        }
        return new ResponseResult(200, "注册成功");
    }
}
