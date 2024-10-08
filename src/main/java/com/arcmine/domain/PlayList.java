package com.arcmine.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlayList {
    private Integer id;
    private String title;
    private String introduction;
    private String useraccount;
}
