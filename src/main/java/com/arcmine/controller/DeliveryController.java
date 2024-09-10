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
    @GetMapping("/musicdelivery")
    public List<Song> MusicDelivery(@RequestParam("style") String style) {
        List<Song> songs = songService.getSongByStyle(style);
        return songs;
    }

    @ResponseBody
    @GetMapping("/mvdelivery")
    public List<Mv> MvDelivery(@RequestParam("style") String style) {
        List<Mv> mvs = mvService.getMvByStyle(style);
        return mvs;
    }
}
