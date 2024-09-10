package com.arcmine.service;

import com.arcmine.domain.ListPlay;
import com.arcmine.domain.Song;

import java.util.List;

public interface SongService {
    List<Song> getSongByStyle(String style);
    Integer addToPlayList(Integer songId,Integer playListId);
    ListPlay isSongInPlayList(Integer songId, Integer playListId);
}
