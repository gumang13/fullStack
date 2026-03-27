package com.spot.community.entity;

import com.spot.map.entity.Spot;
import com.spot.member.entity.Member;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

/**
 * post 테이블 매핑 엔티티
 */
@Entity
@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)
@Table(name = "post")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id", nullable = false)
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "spot_id")
    private Spot spot;

    /** 제목 */
    @Column(nullable = false, length = 255)
    private String title;

    /** 본문 */
    @Column(columnDefinition = "TEXT")
    private String content;

    /** 게시글 타입 (NORMAL / FIELD_NEWS) */
    @Column(nullable = false, length = 20)
    private String type = "NORMAL";

    /** 이미지 URL */
    @Column(length = 255)
    private String imageUrl;

    /** 좋아요 수 */
    @Column(nullable = false)
    private int likeCount = 0;

    /** 베스트 고정 여부 */
    @Column(nullable = false)
    private boolean best = false;

    /** 매직아워 여부 */
    @Column(nullable = false)
    private boolean magicHour = false;

    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime createdAt;

    @LastModifiedDate
    private LocalDateTime updatedAt;
}
