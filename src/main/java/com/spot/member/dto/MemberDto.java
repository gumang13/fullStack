package com.spot.member.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * 회원 응답 DTO (관리자 회원 목록 응답 데이터 전달 객체)
 */
@Getter
@Setter
public class MemberDto {
    private Long memberId;
    private String email;
    private String nickname;
    private String profileImageUrl;
    private String role;
    private String status;
}
