package com.sputnikgo.repository;

import com.sputnikgo.model.promo.PromoRedemption;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PromoRedemptionRepository extends JpaRepository<PromoRedemption, Long> {
    long countByPromoId(Long promoId);
    long countByPromoIdAndUserId(Long promoId, Long userId);
}

