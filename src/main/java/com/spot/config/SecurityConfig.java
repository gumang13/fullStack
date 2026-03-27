package com.spot.config;

import com.spot.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

/**
 * Spring Security 인증·인가·로그인·로그아웃 설정
 */
@Configuration
public class SecurityConfig {

    @Autowired
    private MemberService memberService;

    /**
     * 인증/인가 설정, 로그인·로그아웃 URL 및 권한 설정
     */
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/sign-up", "/log-in", "/api/weather", "/field-news", "/main/**", "/spots/**", "/community/**").permitAll()
                .requestMatchers("/admin/**").hasRole("ADMIN")
                .anyRequest().authenticated()
            )
            .formLogin(form -> form
                .loginPage("/log-in")
                .loginProcessingUrl("/log-in")
                .defaultSuccessUrl("/main")
                .permitAll()
            )
            .logout(logout -> logout
                .logoutUrl("/log-out")
                .logoutSuccessUrl("/log-in")
                .invalidateHttpSession(true)
                .permitAll()
            )
            .csrf(csrf -> csrf.disable());

        return http.build();
    }

    /**
     * BCrypt 비밀번호 암호화 빈 등록
     */
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
