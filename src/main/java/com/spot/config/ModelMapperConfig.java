package com.spot.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ModelMapper 빈 등록 (Entity ↔ Dto 변환)
 */
@Configuration
public class ModelMapperConfig {

    /**
     * ModelMapper 빈 등록 (Entity ↔ Dto 변환)
     */
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
