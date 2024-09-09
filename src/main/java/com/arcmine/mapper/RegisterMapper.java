package com.arcmine.mapper;

import com.arcmine.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface RegisterMapper {
    Integer register(User user);
}
