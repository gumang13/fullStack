package com.spot.community.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

/**
 * 커뮤니티 목록 응답 데이터 전달 객체
 */
@Getter
@Setter
public class PostDto {
    private Long postId;
    private String title;
    private String imageUrl;
    private int likeCount;
    private String authorNickname;
    private String district;
    private List<String> tags;
    private LocalDateTime createdAt;
    private boolean magicHour;
}
