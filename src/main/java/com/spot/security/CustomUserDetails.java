package com.spot.security;

import com.spot.member.entity.Member;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

/**
 * Spring Security UserDetails 구현체 (로그인 회원 정보 보관)
 */
@Getter
@RequiredArgsConstructor
public class CustomUserDetails  {


}
