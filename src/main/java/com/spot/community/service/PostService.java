package com.spot.community.service;

import com.spot.community.dto.*;
import com.spot.community.entity.*;
import com.spot.community.repository.*;
import com.spot.map.entity.Spot;
import com.spot.map.repository.SpotRepository;
import com.spot.member.entity.Member;
import com.spot.member.repository.MemberRepository;
import com.spot.member.service.AlarmService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * 게시글 CRUD 및 좋아요 로직
 */
@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class PostService {


}