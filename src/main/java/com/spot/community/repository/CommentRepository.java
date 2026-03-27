package com.spot.community.repository;

import com.spot.community.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * comment 테이블 DB 접근
 */
@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {


}
