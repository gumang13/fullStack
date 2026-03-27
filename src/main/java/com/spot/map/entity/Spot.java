package com.spot.map.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

/**
 * spot 테이블 매핑 엔티티
 */
@Entity
@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)
@Table(name = "spot")
public class Spot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /** 장소 이름 */
    @Column(nullable = false, length = 100)
    private String name;

    /** 위도 */
    @Column(nullable = false)
    private Double latitude;

    /** 경도 */
    @Column(nullable = false)
    private Double longitude;

    /** 카테고리 (동구/서구/중구/유성구/대덕구) */
    @Column(nullable = false, length = 20)
    @Enumerated(EnumType.STRING)
    private String category;

    /** 주소 */
    @Column(length = 255)
    private String address;

    /** 설명 */
    @Column(columnDefinition = "TEXT")
    private String description;

    /** 대표사진 URL */
    @Column(length = 255)
    private String coverUrl;

    /** 좋아요 수 (post 에서 집계) */
    @Column(nullable = false)
    private int likeCount = 0;

    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime createdAt;

    @LastModifiedDate
    private LocalDateTime updatedAt;
}
