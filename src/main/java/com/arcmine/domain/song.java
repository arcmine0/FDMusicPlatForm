package com.arcmine.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class song {
    private Integer id;
    private String name;
    private String artist;
    private String Picture;
    private String lyrics;
    private String style;
    private String url;
}
