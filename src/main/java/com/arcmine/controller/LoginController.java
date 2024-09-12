package com.arcmine.controller;

import com.arcmine.domain.ResponseResult;
import com.arcmine.domain.User;
import com.arcmine.service.LoginService;
import com.arcmine.utils.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Controller
@ResponseBody
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/login")
    public ResponseResult login(@RequestBody User user) {
        User loginUser = null;
        try {
            loginUser = loginService.login(user);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("登录异常");
        }
        Map<String, Object> map;
        if (loginUser != null) {
            map = new HashMap();
            String token = JwtUtil.createJWT(UUID.randomUUID().toString(), String.valueOf(user.getId()), null);
            map.put("token", token);
        } else {
            throw new RuntimeException("用户名或密码错误，请重新登录");
        }
        return new ResponseResult(200, "登录成功", map);
    }
}
