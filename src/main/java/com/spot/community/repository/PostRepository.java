package com.spot.community.repository;

import com.spot.community.dto.SearchDto;
import com.spot.community.entity.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * post 테이블 DB 접근
 */
@Repository
public interface PostRepository extends JpaRepository<Post, Long> {


}
