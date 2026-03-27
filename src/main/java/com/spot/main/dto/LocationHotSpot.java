package com.spot.main.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * 지역별 핫 스팟 데이터 전달 객체
 */
@Getter
@Setter
public class LocationHotSpot {
    private Long spotId;
    private String name;
    private String category;
    private String coverUrl;
    private int likeCount;
    private Double latitude;
    private Double longitude;
}
