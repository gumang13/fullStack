package com.spot.community.repository;

import com.spot.community.entity.Hashtag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * hashtag 테이블 DB 접근
 */
@Repository
public interface HashtagRepository extends JpaRepository<Hashtag, Long> {


}
