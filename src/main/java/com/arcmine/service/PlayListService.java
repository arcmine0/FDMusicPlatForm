package com.arcmine.service;

import com.arcmine.domain.PlayList;
import com.arcmine.domain.Song;

import java.util.List;

public interface PlayListService {
    List<PlayList> getPlayLists(String account);
    List<Song> getSongs(Integer playListId);
    Integer deleteSong(Integer playListId, Integer songId);
    Integer changeListInfo(PlayList playList);
    Integer createPlayList(PlayList playList);
    Integer deletePlayList(Integer id);
}
