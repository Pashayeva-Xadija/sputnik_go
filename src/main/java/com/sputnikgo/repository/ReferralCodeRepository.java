package com.sputnikgo.repository;

import com.sputnikgo.model.user.ReferralCode;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ReferralCodeRepository extends JpaRepository<ReferralCode, Long> {
    Optional<ReferralCode> findByCodeAndActiveTrue(String code);
}