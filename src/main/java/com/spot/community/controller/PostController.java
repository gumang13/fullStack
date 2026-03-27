package com.spot.community.controller;

import com.spot.community.dto.*;
import com.spot.community.service.FieldNewsService;
import com.spot.community.service.PostService;
import com.spot.security.CustomUserDetails;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * 게시글 관련 HTTP 요청 처리
 */
@Controller
@RequiredArgsConstructor
public class PostController {


}
