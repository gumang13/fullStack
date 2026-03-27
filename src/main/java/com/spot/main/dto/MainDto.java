package com.spot.main.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 메인 페이지 통합 응답 데이터 전달 객체
 */
@Getter
@Setter
public class MainDto {
    private List<NewSpot> newSpots;
    private List<BestPost> bestPosts;
}
