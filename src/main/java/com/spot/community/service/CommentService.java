package com.spot.community.service;

import com.spot.community.dto.CommentDto;
import com.spot.community.entity.Comment;
import com.spot.community.entity.Post;
import com.spot.community.entity.Report;
import com.spot.community.repository.CommentRepository;
import com.spot.community.repository.PostRepository;
import com.spot.community.repository.ReportRepository;
import com.spot.member.entity.Member;
import com.spot.member.repository.MemberRepository;
import com.spot.member.service.AlarmService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 댓글 CRUD 로직
 */
@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class CommentService {



}
