package com.spot.community.dto;

import lombok.Getter;
import lombok.Setter;

/** 신고 요청 데이터 전달 객체 */
@Getter @Setter
public class ReportDto {
    private Long targetId;
    private String targetType;   // POST / COMMENT
    private String reason;
    private String status;       // 응답 시 사용
    private String reporterNickname;
}
