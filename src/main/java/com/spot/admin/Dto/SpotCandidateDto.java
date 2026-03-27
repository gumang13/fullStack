package com.spot.admin.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * 스팟 등록 후보 응답 DTO (게시글 좋아요 집계 기반)
 */
@Getter
@Setter
public class SpotCandidateDto {
    private Long postId;
    private String title;
    private String imageUrl;
    private int likeCount;
    private String authorNickname;
    private Double latitude;
    private Double longitude;
    private String district;
}
