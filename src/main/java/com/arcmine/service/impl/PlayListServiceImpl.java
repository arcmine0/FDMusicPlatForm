package com.arcmine.service.impl;

import com.arcmine.domain.PlayList;
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
}
