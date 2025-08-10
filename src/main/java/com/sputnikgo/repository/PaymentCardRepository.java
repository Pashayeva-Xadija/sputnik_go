package com.sputnikgo.repository;

import com.sputnikgo.model.payment.PaymentCard;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PaymentCardRepository extends JpaRepository<PaymentCard, Long> {
    List<PaymentCard> findAllByUserId(Long userId);
    boolean existsByToken(String token);
}
