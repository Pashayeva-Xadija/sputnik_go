package com.sputnikgo.repository;

import com.sputnikgo.model.support.SupportTicket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SupportTicketRepository extends JpaRepository<SupportTicket, Long> {
    List<SupportTicket> findAllByUserIdOrderByCreatedAtDesc(Long userId);
}
