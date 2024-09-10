package com.arcmine.service;

import com.arcmine.domain.PlayList;

import java.util.List;

public interface PlayListService {
    List<PlayList> getPlayLists(String account);
}
