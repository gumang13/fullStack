package com.spot.member.repository;

import com.spot.member.entity.MemberStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



/**
 * member_status 테이블 DB 접근
 */
@Repository
public interface MemberStatusRepository extends JpaRepository<MemberStatus, Long> {


}
