package com.spot.community.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * 게시글 검색 조건 DTO
 */
@Getter
@Setter
public class SearchDto {
    private String keyword;
    private String district;
    private Boolean magicHour;
    /** 정렬 기준: latest / popular */
    private String sort = "latest";
}
