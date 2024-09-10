package com.arcmine.service;

import com.arcmine.domain.Mv;

import java.util.List;

public interface MvService {
    List<Mv> getMvByStyle(String style);
}
