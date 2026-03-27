package com.spot.main.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * 날씨 응답 데이터 전달 객체
 */
@Getter
@Setter
public class WeatherDto {
    private Double temperature;
    private String weatherCode;
    private String description;
    private Double humidity;
    private Double visibility;
    private String fineDustGrade;
}
