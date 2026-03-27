package com.spot.community.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 게시글 작성·수정 요청 데이터 전달 객체
 */
@Getter
@Setter
public class PostWriteDto {

    @NotBlank
    private String title;

    @NotBlank
    private String content;

    /** 게시글 타입 (NORMAL/FIELD_NEWS) */
    private String type = "NORMAL";

    private Long spotId;
    private String imageUrl;

    // EXIF 촬영 정보
    private String camera;
    private Double aperture;
    private String shutterSpeed;
    private Integer iso;
    private String lens;
    private String shotTime;
    private boolean isMagicHour = false;

    private List<String> tags;
}
