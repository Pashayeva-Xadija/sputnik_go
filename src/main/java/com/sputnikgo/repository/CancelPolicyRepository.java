package com.sputnikgo.repository;

import com.sputnikgo.model.pricing.CancelPolicy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CancelPolicyRepository extends JpaRepository<CancelPolicy, Long> { }
