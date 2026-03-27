package com.spot.mypage.repository;

import com.spot.mypage.entity.RouteSpot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * route_spot 테이블 DB 접근
 */
@Repository
public interface RouteSpotRepository extends JpaRepository<RouteSpot, Long> {


}
