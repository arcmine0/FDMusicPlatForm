package com.arcmine.service.impl;

import com.arcmine.domain.ListPlay;
import com.arcmine.domain.Song;
import com.arcmine.mapper.SongMapper;
import com.arcmine.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongServiceImpl implements SongService {

    @Autowired
    private SongMapper songMapper;

    @Override
    public List<Song> getSongByStyle(String style) {
        List<Song> songList = songMapper.getSongByStyle(style);
        return songList;
    }

    @Override
    public Integer addToPlayList(Integer songId, String playListTitle) {
        Integer add = songMapper.addToPlayList(songId, playListTitle);
        return add;
    }

    @Override
    public ListPlay isSongInPlayList(Integer songId, String playListTitle) {
        ListPlay exists = songMapper.isSongInPlayList(songId, playListTitle);
        return exists;
    }

    @Override
    public Song getSongById(Integer id) {
        Song song = songMapper.getSongById(id);
        return song;
    }
}
