package com.sputnikgo.repository;

import com.sputnikgo.model.user.UserConsent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserConsentRepository extends JpaRepository<UserConsent, Long> {
    Optional<UserConsent> findTopByUserIdAndPolicyOrderByAcceptedAtDesc(Long userId, String policy);
}
