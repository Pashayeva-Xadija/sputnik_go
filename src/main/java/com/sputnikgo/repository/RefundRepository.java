package com.sputnikgo.repository;

import com.sputnikgo.model.payment.Refund;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RefundRepository extends JpaRepository<Refund, Long> {
    List<Refund> findAllByPaymentId(Long paymentId);
}
