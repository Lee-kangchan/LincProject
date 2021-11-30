package com.chan.link.domain.link.dto;


import lombok.*;

import java.util.List;
import java.util.Set;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LinkDto {
    private String title;
    private String image;
    private String content;
    private Set<String> list;
}