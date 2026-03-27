package com.spot.map.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * 핀 팝업용 스팟 요약 응답 DTO
 */
@Getter
@Setter
public class SpotSummaryDto {
    private Long id;
    private String name;
    private String description;
    private String coverUrl;
    private String goldenHourInfo;
    private int likeCount;
}
