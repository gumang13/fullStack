package com.spot.mypage.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

/**
 * 출사 루트 상세 응답 데이터 전달 객체
 */
@Getter
@Setter
public class RouteDetailDto {
    private Long id;
    private String name;
    private boolean isPublic;
    private LocalDateTime createdAt;
    private List<RouteSpotDetail> spots;

    @Getter
    @Setter
    public static class RouteSpotDetail {
        private Long spotId;
        private String spotName;
        private String category;
        private Double latitude;
        private Double longitude;
        private int visitOrder;
        private String memo;
    }
}
