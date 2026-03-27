package com.spot.mypage.entity;

import com.spot.map.entity.Spot;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

/**
 * route_spot 테이블 매핑 엔티티
 */
@Entity
@Getter
@Setter
@Table(name = "route_spot")
public class RouteSpot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "route_preset_id", nullable = false)
    private RoutePreset routePreset;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "spot_id", nullable = false)
    private Spot spot;

    /** 방문 순서 */
    @Column(nullable = false)
    private int visitOrder;

    /** 메모 */
    @Column(length = 500)
    private String memo;
}
