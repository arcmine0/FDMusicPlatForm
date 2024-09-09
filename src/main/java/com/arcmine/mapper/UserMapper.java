package com.arcmine.mapper;

import com.arcmine.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {
    User getUserByAccount(String account);
}
