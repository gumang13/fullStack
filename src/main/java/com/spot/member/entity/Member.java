package com.spot.member.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

/**
 * member 테이블 매핑 엔티티
 */
@Entity
@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)
@Table(name = "member")
public class Member {

    /** PK */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /** 이메일 (unique) */
    @Column(unique = true, nullable = false, length = 200)
    private String email;

    /** 비밀번호 (암호화) */
    @Column(nullable = false, length = 255)
    private String password;

    /** 닉네임 (unique) */
    @Column(unique = true, nullable = false, length = 20)
    private String nickname;

    /** 권한 (USER/ADMIN) */
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private String role = "USER";

    /** 프로필 이미지 URL */
    @Column(length = 255)
    private String profileImage;

    /** 생성일시 */
    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime createdAt;

    /** 수정일시 */
    @LastModifiedDate
    private LocalDateTime updatedAt;
}
