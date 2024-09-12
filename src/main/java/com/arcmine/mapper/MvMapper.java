package com.arcmine.mapper;

import com.arcmine.domain.Mv;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface MvMapper {
    List<Mv> getMvByStyle(String style);
    Mv getMvById(Integer id);
}
