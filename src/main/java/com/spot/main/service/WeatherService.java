package com.spot.main.service;

import com.spot.main.dto.WeatherDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

/**
 * 외부 날씨 API 연동 서비스
 */
@Service
@RequiredArgsConstructor
public class WeatherService {

    private final RestTemplate restTemplate;

    @Value("${weather.api.url:https://api.openweathermap.org/data/2.5/weather}")
    private String weatherApiUrl;

    @Value("${weather.api.key:}")
    private String weatherApiKey;

    /**
     * 외부 날씨 API 호출 후 결과 반환
     *
     * @param lat 위도
     * @param lon 경도
     * @return 날씨 정보 DTO
     */
    @SuppressWarnings("unchecked")
    public WeatherDto getWeather(Double lat, Double lon) {
        String url = String.format("%s?lat=%s&lon=%s&appid=%s&units=metric&lang=kr",
                weatherApiUrl, lat, lon, weatherApiKey);

        try {
            Map<String, Object> response = restTemplate.getForObject(url, Map.class);
            WeatherDto dto = new WeatherDto();

            if (response != null) {
                Map<String, Object> main = (Map<String, Object>) response.get("main");
                if (main != null) {
                    dto.setTemperature(((Number) main.get("temp")).doubleValue());
                    dto.setHumidity(((Number) main.get("humidity")).doubleValue());
                }
                java.util.List<Map<String, Object>> weatherList =
                        (java.util.List<Map<String, Object>>) response.get("weather");
                if (weatherList != null && !weatherList.isEmpty()) {
                    Map<String, Object> weather = weatherList.get(0);
                    dto.setWeatherCode(String.valueOf(weather.get("main")));
                    dto.setDescription(String.valueOf(weather.get("description")));
                }
            }
            return dto;
        } catch (Exception e) {
            throw new RuntimeException("날씨 API 호출 실패: " + e.getMessage(), e);
        }
    }
}
