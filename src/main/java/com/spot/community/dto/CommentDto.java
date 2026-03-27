package com.spot.community.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * 댓글 작성·수정 요청 / 응답 데이터 전달 객체
 */
@Getter
@Setter
public class CommentDto {
    private Long commentId;
    private Long postId;
    private Long authorId;
    private String authorNickname;
    private String authorProfileImage;
    private String content;
    private LocalDateTime createdAt;
}
