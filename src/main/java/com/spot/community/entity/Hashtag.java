package com.spot.community.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

/**
 * hashtag 테이블 매핑 엔티티
 */
@Entity
@Getter
@Setter
@Table(name = "hashtag")
public class Hashtag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id", nullable = false)
    private Post post;

    @Column(nullable = false, length = 50)
    private String tag;
}
