package com.arcmine.mapper;

import com.arcmine.domain.PlayList;
import com.arcmine.domain.Song;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface PlayListMapper {
    List<PlayList> getPlayLists(String account);
    List<Song> getSongs(Integer playListId);
    Integer deleteSong(Integer playListId, Integer songId);
    Integer changeListInfo(PlayList playList);
    Integer createPlayList(PlayList playList);
    Integer deletePlayList(Integer id);
}
