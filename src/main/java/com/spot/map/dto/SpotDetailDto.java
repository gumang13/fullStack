package com.spot.map.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 사이드바용 스팟 상세 응답 DTO
 */
@Getter
@Setter
public class SpotDetailDto {
    private Long id;
    private String name;
    private String description;
    private String coverUrl;
    private String category;
    private Double latitude;
    private Double longitude;
    private List<?> posts;   // Page<PostDto> 로 대체 가능
}
