package com.spot.community.entity;

import com.spot.member.entity.Member;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

/**
 * report 테이블 매핑 엔티티
 */
@Entity
@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)
@Table(name = "report")
public class Report {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /** 신고자 */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "reporter_id", nullable = false)
    private Member reporter;

    /** 신고 대상 ID (post_id 또는 comment_id) */
    @Column(nullable = false)
    private Long targetId;

    /** 신고 대상 타입 (POST / COMMENT) */
    @Column(nullable = false, length = 20)
    private String targetType;

    /** 신고 사유 */
    @Column(nullable = false, length = 500)
    private String reason;

    /** 처리 상태 (PENDING / RESOLVED / DISMISSED) */
    @Column(nullable = false, length = 20)
    private String status = "PENDING";

    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime createdAt;
}
