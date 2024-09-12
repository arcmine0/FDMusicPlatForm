package com.arcmine.service.impl;

import com.arcmine.domain.PlayList;
import com.arcmine.domain.ResponseResult;
import com.arcmine.domain.Song;
import com.arcmine.mapper.PlayListMapper;
import com.arcmine.service.PlayListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayListServiceImpl implements PlayListService {

    @Autowired
    private PlayListMapper playListMapper;

    @Override
    public List<PlayList> getPlayLists(String account) {
        List<PlayList> playLists = playListMapper.getPlayLists(account);
        return playLists;
    }

    @Override
    public List<Song> getSongs(Integer playListId) {
        List<Song> songs = playListMapper.getSongs(playListId);
        return songs;
    }

    @Override
    public Integer deleteSong(Integer playListId, Integer songId) {
        Integer delete = playListMapper.deleteSong(playListId, songId);
        return delete;
    }

    @Override
    public Integer changeListInfo(PlayList playList) {
        Integer change = playListMapper.changeListInfo(playList);
        return change;
    }

    @Override
    public Integer createPlayList(PlayList playList) {
        Integer create = playListMapper.createPlayList(playList);
        return create;
    }

    @Override
    public Integer deletePlayList(Integer id) {
        Integer delete = playListMapper.deletePlayList(id);
        return delete;
    }
}
