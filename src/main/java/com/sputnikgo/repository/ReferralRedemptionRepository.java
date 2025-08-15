package com.sputnikgo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ReferralRedemptionRepository extends JpaRepository<ReferralRedemptionRepository, Long> {
    long countByCodeId(Long codeId);
    long countByCodeIdAndUserId(Long codeId, Long userId);
}
