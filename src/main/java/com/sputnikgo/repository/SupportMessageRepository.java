package com.sputnikgo.repository;

import com.sputnikgo.model.support.SupportMessage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SupportMessageRepository extends JpaRepository<SupportMessage, Long> {
    List<SupportMessage> findAllByTicketIdOrderByCreatedAtAsc(Long ticketId);
}
