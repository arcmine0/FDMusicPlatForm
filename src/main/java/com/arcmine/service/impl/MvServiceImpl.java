package com.arcmine.service.impl;

import com.arcmine.domain.Mv;
import com.arcmine.mapper.MvMapper;
import com.arcmine.service.MvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MvServiceImpl implements MvService {

    @Autowired
    private MvMapper mvMapper;

    @Override
    public List<Mv> getMvByStyle(String style) {
        List<Mv> mvList = mvMapper.getMvByStyle(style);
        return mvList;
    }
}
