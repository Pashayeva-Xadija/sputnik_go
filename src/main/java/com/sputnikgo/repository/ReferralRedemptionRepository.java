package com.sputnikgo.repository;

import com.sputnikgo.model.user.ReferralRedemption;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReferralRedemptionRepository extends JpaRepository<ReferralRedemption, Long> {
    long countByCodeId(Long codeId);
    long countByCodeIdAndUserId(Long codeId, Long userId);
}
