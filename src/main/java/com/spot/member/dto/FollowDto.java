package com.spot.member.dto;

import lombok.Getter;
import lombok.Setter;

/** 팔로우/언팔로우 응답 데이터 전달 객체 */
@Getter
@Setter
public class FollowDto {
    private Long followerId;
    private Long followingId;
    private boolean following;
}
