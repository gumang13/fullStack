package com.spot.community.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

/**
 * 커뮤니티 상세 응답 데이터 전달 객체
 */
@Getter
@Setter
public class PostDetailDto {
    private Long postId;
    private String title;
    private String content;
    private String imageUrl;
    private int likeCount;
    private boolean likedByMe;
    private String authorNickname;
    private String authorProfileImage;
    private Long authorId;
    private String district;
    private List<String> tags;
    private LocalDateTime createdAt;

    // EXIF
    private String camera;
    private Double aperture;
    private String shutterSpeed;
    private Integer iso;
    private String lens;
    private String shotTime;
    private boolean magicHour;

    // 연결 스팟
    private Long spotId;
    private String spotName;
    private Double latitude;
    private Double longitude;

    private List<CommentDto> comments;
}
