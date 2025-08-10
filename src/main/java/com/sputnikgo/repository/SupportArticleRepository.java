package com.sputnikgo.repository;

import com.sputnikgo.model.support.SupportArticle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupportArticleRepository extends JpaRepository<SupportArticle, Long> { }