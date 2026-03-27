package com.spot.admin.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * 관리자 회원 상세 응답 데이터 전달 객체
 */
@Getter
@Setter
public class MemberDetailDto {
    private Long memberId;
    private String email;
    private String nickname;
    private String profileImageUrl;
    private String role;
    private String status;
    private LocalDateTime banUntil;
    private LocalDateTime createdAt;
    private int postCount;
    private int commentCount;
    private int reportCount;
}
