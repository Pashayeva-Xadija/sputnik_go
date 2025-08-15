package com.sputnikgo.repository;

import com.sputnikgo.model.user.Session;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface SessionRepository extends JpaRepository<Session, Long> {
    Optional<Session> findByToken(String token);
    List<Session> findAllByUserId(Long userId);
}
