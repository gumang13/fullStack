package com.spot.member.repository;

import com.spot.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



/**
 * member 테이블 DB 접근
 */
@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {


}
