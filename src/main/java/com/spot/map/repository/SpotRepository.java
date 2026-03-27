package com.spot.map.repository;

import com.spot.map.entity.Spot;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * spot 테이블 DB 접근
 */
@Repository
public interface SpotRepository extends JpaRepository<Spot, Long> {


}
