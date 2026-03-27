package com.spot.member.dto;

import lombok.Getter;
import lombok.Setter;

/** 비밀번호 변경 요청 DTO */
@Getter
@Setter
public class PasswordDto {
    private String currentPassword;
    private String newPassword;
    private String confirmPassword;
}
