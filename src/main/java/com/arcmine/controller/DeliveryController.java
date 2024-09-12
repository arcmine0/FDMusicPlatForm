package com.arcmine.controller;

import com.arcmine.domain.Mv;
import com.arcmine.domain.Song;
import com.arcmine.service.MvService;
import com.arcmine.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class DeliveryController {

    @Autowired
    private SongService songService;

    @Autowired
    private MvService mvService;

    @ResponseBody
    @GetMapping("/musicDelivery")
    public List<Song> MusicDelivery(@RequestParam("style") String style) {
        List<Song> songs;
        try {
            songs = songService.getSongByStyle(style);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("获取音乐异常");
        }
        if (songs == null) {
            throw new RuntimeException("获取音乐失败");
        }
        return songs;
    }

    @ResponseBody
    @GetMapping("/mvDelivery")
    public List<Mv> MvDelivery(@RequestParam("style") String style) {
        List<Mv> mvs;
        try {
            mvs = mvService.getMvByStyle(style);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("获取mv异常");
        }
        if (mvs == null) {
            throw new RuntimeException("获取mv失败");
        }
        return mvs;
    }
}
