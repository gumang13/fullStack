package com.spot.main.dto;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

/** 새로운 스팟 데이터 전달 객체 */
@Getter @Setter
public class NewSpot {
    private Long id;
    private String name;
    private String category;
    private String coverUrl;
    private LocalDateTime createdAt;
}
