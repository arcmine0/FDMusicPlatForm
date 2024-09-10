package com.arcmine.controller;

import com.arcmine.domain.ListPlay;
import com.arcmine.domain.ResponseResult;
import com.arcmine.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SongController {

    @Autowired
    private SongService songService;

    @GetMapping("/addtoplaylist")
    @ResponseBody
    public ResponseResult addToPlayList(@RequestParam("songId") Integer songId, @RequestParam("playListId") Integer playListId) {
        ListPlay exists = songService.isSongInPlayList(songId, playListId);
        if(exists != null) {
            return new ResponseResult(200,"歌曲已在播放列表中");
        }
        Integer result = songService.addToPlayList(songId, playListId);
        return new ResponseResult(200,"添加成功");
    }
}
