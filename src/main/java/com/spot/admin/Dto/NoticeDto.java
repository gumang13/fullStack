package com.spot.admin.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * 공지 작성 요청 DTO
 */
@Getter
@Setter
public class NoticeDto {
    private String title;
    private String content;
}
