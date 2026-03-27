package com.spot.mypage.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 출사 루트 요청 데이터 전달 객체
 */
@Getter
@Setter
public class RouteDto {
    private Long id;
    private String name;
    private boolean isPublic;
    private List<RouteSpotItem> spots;

    @Getter
    @Setter
    public static class RouteSpotItem {
        private Long spotId;
        private int visitOrder;
        private String memo;
    }
}
