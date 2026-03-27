package com.spot.community.repository;

import com.spot.community.entity.Settings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * settings 테이블 DB 접근 (EXIF 촬영 정보)
 */
@Repository
public interface SettingsRepository extends JpaRepository<Settings, Long> {


}
