package com.sputnikgo.repository;

import com.sputnikgo.model.user.OtpCode;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OtpCodeRepository extends JpaRepository<OtpCode, Long> {
    Optional<OtpCode> findTopByPhoneAndPurposeOrderByExpiresAtDesc(String phone, String purpose);

    void deleteByPhone(String phone);
}

