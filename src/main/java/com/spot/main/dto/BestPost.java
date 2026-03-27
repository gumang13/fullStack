package com.spot.main.dto;

import lombok.Getter;
import lombok.Setter;

/** 베스트샷 데이터 전달 객체 */
@Getter @Setter
public class BestPost {
    private Long postId;
    private String title;
    private String imageUrl;
    private int likeCount;
    private String authorNickname;
}
