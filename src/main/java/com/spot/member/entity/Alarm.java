package com.spot.member.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

/**
 * alarm 테이블 매핑 엔티티
 */
@Entity
@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)
@Table(name = "alarm")
public class Alarm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id", nullable = false)
    private Member member;

    /** 알림 타입 (LIKE / FOLLOW / COMMENT / ADMIN) */
    @Column(nullable = false, length = 30)
    private String type;

    /** 연관 대상 ID */
    private Long typeId;

    /** 알림 내용 */
    @Column(nullable = false, length = 255)
    private String content;

    /** 읽음 여부 */
    @Column(nullable = false)
    private boolean isRead = false;

    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime createdAt;
}
