package com.spot.member.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * 마이페이지 응답 데이터 전달 객체
 */
@Getter
@Setter
public class MyPageDto {
    private Long memberId;
    private String email;
    private String nickname;
    private String profileImageUrl;
    private String bio;
    private long followerCount;
    private long followingCount;
}
