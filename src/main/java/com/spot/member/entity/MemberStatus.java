package com.spot.member.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * member_status 테이블 매핑 엔티티
 */
@Entity
@Getter
@Setter
@Table(name = "member_status")
public class MemberStatus {

    /** PK */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /** 회원 (FK) */
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id", nullable = false)
    private Member member;

    /** 상태 (ACTIVE/SUSPENDED/BLOCKED) */
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private String status = "ACTIVE";

    /** 제재 만료일시 */
    @Column
    private LocalDateTime banUntil;
}
