package com.arcmine.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ListPlay {
    private Integer songid;
    private Integer playlistid;
}
