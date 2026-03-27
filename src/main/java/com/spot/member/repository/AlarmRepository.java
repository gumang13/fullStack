package com.spot.member.repository;

import com.spot.member.entity.Alarm;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * alarm 테이블 DB 접근
 */
@Repository
public interface AlarmRepository extends JpaRepository<Alarm, Long> {


}
