package com.arcmine.controller;

import com.arcmine.domain.PlayList;
import com.arcmine.domain.ResponseResult;
import com.arcmine.domain.Song;
import com.arcmine.service.PlayListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class PlayListController {

    @Autowired
    private PlayListService playListService;

    @PostMapping("/createPlayList")
    @ResponseBody
    public ResponseResult createPlayList(@RequestBody PlayList playList) {
        Integer create;
        try {
            create = playListService.createPlayList(playList);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("创建异常");
        }
        if (create != 1) {
            throw new RuntimeException("创建失败");
        }
        return new ResponseResult(200, "创建成功");
    }

    @GetMapping("/deletePlayList")
    @ResponseBody
    public ResponseResult deletePlayList(@RequestParam("id") Integer id) {
        Integer delete;
        try {
            delete = playListService.deletePlayList(id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("删除异常");
        }
        if (delete != 1) {
            throw new RuntimeException("删除失败");
        }
        return new ResponseResult(200, "删除成功");
    }

    @GetMapping("/myPlayList")
    @ResponseBody
    public List<PlayList> PlayListController(@RequestParam String account) {
        List<PlayList> playLists;
        try {
            playLists = playListService.getPlayLists(account);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("获取歌单异常");
        }
        if (playLists == null) {
            throw new RuntimeException("获取歌单失败");
        }
        return playLists;
    }

    @GetMapping("/getSongs")
    @ResponseBody
    public List<Song> getSongs(@RequestParam("id") Integer id) {
        List<Song> songs;
        try {
            songs = playListService.getSongs(id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("获取歌曲异常");
        }
        if (songs == null) {
            throw new RuntimeException("获取歌曲失败");
        }
        return songs;
    }

    @GetMapping("/deleteSong")
    @ResponseBody
    public ResponseResult deleteSong(@RequestParam("playListId") Integer playListId,@RequestParam("songId") Integer songId) {
        Integer delete;
        try {
            delete = playListService.deleteSong(playListId, songId);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("删除异常");
        }
        if (delete != 1) {
            throw new RuntimeException("删除失败");
        }
        return new ResponseResult(200, "删除成功");
    }

    @PostMapping("/changeListInfo")
    @ResponseBody
    public ResponseResult changeListInfo(@RequestBody PlayList playList) {
        Integer change;
        try {
            change = playListService.changeListInfo(playList);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("修改异常");
        }
        if(change != 1) {
            throw new RuntimeException("修改失败");
        }
        return new ResponseResult(200, "修改成功");
    }
}
