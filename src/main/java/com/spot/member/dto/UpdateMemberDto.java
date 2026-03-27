package com.spot.member.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * 회원 정보 수정 요청 DTO
 */
@Getter
@Setter
public class UpdateMemberDto {
    private String nickname;
    private String profileImageUrl;
    private String bio;
}
