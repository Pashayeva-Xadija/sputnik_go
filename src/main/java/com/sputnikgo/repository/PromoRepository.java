package com.sputnikgo.repository;

import com.sputnikgo.model.promo.Promo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PromoRepository extends JpaRepository<Promo, Long> {
    Optional<Promo> findByCodeAndActiveTrue(String code);
}
