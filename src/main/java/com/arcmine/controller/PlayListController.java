package com.arcmine.controller;

import com.arcmine.domain.PlayList;
import com.arcmine.service.PlayListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PlayListController {

    @Autowired
    private PlayListService playListService;

    @GetMapping("/myplaylist")
    @ResponseBody
    public List<PlayList> PlayListController(@RequestParam String account) {
        List<PlayList> playLists = playListService.getPlayLists(account);
        return playLists;
    }

}
