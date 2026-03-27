package com.spot.member.service;


import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 팔로우 관계 로직
 */
@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class FollowService {


}
