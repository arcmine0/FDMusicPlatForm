package com.arcmine.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Song {
    private Integer id;
    private String title;
    private String artist;
    private String lyrics;
    private String style;
    private String url;
}
