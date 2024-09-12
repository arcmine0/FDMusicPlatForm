package com.arcmine.controller;

import com.arcmine.domain.Mv;
import com.arcmine.service.MvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MvController {

    @Autowired
    private MvService mvService;

    @GetMapping("/getMv")
    @ResponseBody
    public Mv getMvById(@RequestParam("id") Integer id) {
        Mv mv;
        try {
            mv = mvService.getMvById(id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("获取mv异常");
        }
        if (mv == null) {
            throw new RuntimeException("获取mv失败");
        }
        return mv;
    }
}
