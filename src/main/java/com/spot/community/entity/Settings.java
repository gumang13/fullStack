package com.spot.community.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

/**
 * settings 테이블 매핑 엔티티 (EXIF 촬영 정보)
 */
@Entity
@Getter
@Setter
@Table(name = "settings")
public class Settings {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id", nullable = false)
    private Post post;

    /** 사용 기종 */
    private String camera;

    /** 조리개값 */
    private Double aperture;

    /** 셔터스피드 */
    private String shutterSpeed;

    /** ISO 감도 */
    private Integer iso;

    /** 렌즈 정보 */
    private String lens;

    /** 촬영 시각 */
    private String shotTime;
}
