package com.spot.community.service;


import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



/**
 * 게시글 CRUD 및 좋아요 로직
 */
@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class PostService {


}