package com.spot.community.service;


import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



/**
 * 현장 소식 조회 로직 (폴링 방식, 추후 SSE 전환 예정)
 */
@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class FieldNewsService {


}
