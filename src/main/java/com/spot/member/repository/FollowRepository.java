package com.spot.member.repository;

import com.spot.member.entity.Follow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * follow 테이블 DB 접근
 */
@Repository
public interface FollowRepository extends JpaRepository<Follow, Long> {


}
