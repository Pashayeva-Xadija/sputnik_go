package com.sputnikgo.repository;

import com.sputnikgo.model.user.TrustedContact;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ContactRepository extends JpaRepository<TrustedContact, Long> {
    List<TrustedContact> findAllByOwnerId(Long ownerId);
}

