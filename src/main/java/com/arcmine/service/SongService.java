package com.arcmine.service;

import com.arcmine.domain.ListPlay;
import com.arcmine.domain.Song;

import java.util.List;

public interface SongService {
    List<Song> getSongByStyle(String style);
    Integer addToPlayList(Integer songId,String playListTitle);
    ListPlay isSongInPlayList(Integer songId, String playListTitle);
    Song getSongById(Integer id);
}
