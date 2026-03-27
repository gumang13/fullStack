package com.spot.community.controller;

import com.spot.community.dto.CommentDto;
import com.spot.community.dto.ReportDto;
import com.spot.community.service.CommentService;
import com.spot.security.CustomUserDetails;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * 댓글 관련 HTTP 요청 처리
 */
@Controller
@RequiredArgsConstructor
public class CommentController {


}
