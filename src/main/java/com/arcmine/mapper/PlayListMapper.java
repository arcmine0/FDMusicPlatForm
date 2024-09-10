package com.arcmine.mapper;

import com.arcmine.domain.PlayList;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface PlayListMapper {
    List<PlayList> getPlayLists(String account);
}
