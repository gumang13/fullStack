package com.spot.community.repository;

import com.spot.community.entity.PostLike;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * post_like 테이블 DB 접근
 */
@Repository
public interface PostLikeRepository extends JpaRepository<PostLike, Long> {

}
