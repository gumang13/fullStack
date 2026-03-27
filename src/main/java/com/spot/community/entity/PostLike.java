package com.spot.community.entity;

import com.spot.member.entity.Member;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

/**
 * post_like 테이블 매핑 엔티티
 */
@Entity
@Getter
@Setter
@Table(name = "post_like",
        uniqueConstraints = @UniqueConstraint(columnNames = {"post_id", "member_id"}))
public class PostLike {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id", nullable = false)
    private Post post;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id", nullable = false)
    private Member member;
}
