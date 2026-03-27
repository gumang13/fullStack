package com.spot.community.repository;

import com.spot.community.entity.Report;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * report 테이블 DB 접근
 */
@Repository
public interface ReportRepository extends JpaRepository<Report, Long> {


}
