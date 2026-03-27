package com.spot.mypage.repository;

import com.spot.mypage.entity.RoutePreset;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * route_preset 테이블 DB 접근
 */
@Repository
public interface RoutePresetRepository extends JpaRepository<RoutePreset, Long> {


}
