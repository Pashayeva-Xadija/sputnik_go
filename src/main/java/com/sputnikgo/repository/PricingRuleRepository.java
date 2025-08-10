package com.sputnikgo.repository;

import com.sputnikgo.model.pricing.PricingRule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PricingRuleRepository extends JpaRepository<PricingRule, Long> { }
