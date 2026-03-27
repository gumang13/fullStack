package com.spot.member.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * 알림 응답 데이터 전달 객체
 */
@Getter
@Setter
public class AlarmDto {
    private Long alarmId;
    private String type;
    private Long typeId;
    private String message;
    private boolean isRead;
    private LocalDateTime createdAt;
}
