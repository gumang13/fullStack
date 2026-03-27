package com.spot.admin.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * 관리자 대시보드 응답 데이터 전달 객체
 */
@Getter
@Setter
public class DashboardDto {
    private long totalMembers;
    private long activeToday;
    private long newSignupsToday;
    private long suspendedCount;
    private long totalPostsToday;
    private long totalCommentsToday;
    private long totalLikesToday;
    private long pendingReportCount;
    private long spotCandidateCount;
}
