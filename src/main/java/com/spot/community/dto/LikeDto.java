package com.spot.community.dto;

import lombok.Getter;
import lombok.Setter;

/** 좋아요 토글 응답 데이터 전달 객체 */
@Getter @Setter
public class LikeDto {
    private Long postId;
    private int likeCount;
    private boolean liked;
}
