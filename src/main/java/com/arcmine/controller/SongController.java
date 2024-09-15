package com.arcmine.controller;

import com.arcmine.domain.ListPlay;
import com.arcmine.domain.ResponseResult;
import com.arcmine.domain.Song;
import com.arcmine.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SongController {

    @Autowired
    private SongService songService;

    @GetMapping("/getSong")
    @ResponseBody
    public Song getSongById(@RequestParam("id") Integer id) {
        Song song;
        try {
            song = songService.getSongById(id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("获取歌曲异常");
        }
        if(song == null) {
            throw new RuntimeException("获取歌曲失败");
        }
        return song;
    }

    @GetMapping("/addToPlayList")
    @ResponseBody
    public ResponseResult addToPlayList(@RequestParam("songId") Integer songId, @RequestParam("playListTitle") String playListTitle) {
        ListPlay exists;
        try {
            exists = songService.isSongInPlayList(songId, playListTitle);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("获取歌单信息异常");
        }
        if (exists != null) {
            return new ResponseResult(200, "歌曲已在歌单中");
        }
        Integer result;
        try {
            result = songService.addToPlayList(songId, playListTitle);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("添加异常");
        }
        if (result != 1) {
            throw new RuntimeException("添加失败");
        }
        return new ResponseResult(200, "添加成功");
    }
}
