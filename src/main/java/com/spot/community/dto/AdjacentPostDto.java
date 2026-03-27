package com.spot.community.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * 이전/다음 게시글 응답 데이터 전달 객체
 */
@Getter
@Setter
public class AdjacentPostDto {
    private Long prevPostId;
    private String prevPostTitle;
    private Long nextPostId;
    private String nextPostTitle;
}
