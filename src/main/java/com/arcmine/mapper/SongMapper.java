package com.arcmine.mapper;

import com.arcmine.domain.ListPlay;
import com.arcmine.domain.Song;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface SongMapper {
    List<Song> getSongByStyle(String style);
    Integer addToPlayList(Integer songId,String playListTitle);
    ListPlay isSongInPlayList(Integer songId, String playListTitle);
    Song getSongById(Integer id);
}
