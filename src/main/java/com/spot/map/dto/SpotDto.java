package com.spot.map.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * 스팟 등록·수정 요청 / 응답 데이터 전달 객체
 */
@Getter
@Setter
public class SpotDto {
    private Long id;
    private String name;
    private Double latitude;
    private Double longitude;
    private String category;
    private String address;
    private String description;
    private String coverUrl;
    private int likeCount;
}
