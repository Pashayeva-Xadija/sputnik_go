package com.sputnikgo.repository;

import com.sputnikgo.model.support.SupportArticle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SupportArticleRepository extends JpaRepository<SupportArticle, Long> {
    Optional<SupportArticle> findBySlugAndLanguageAndPublishedTrue(String slug, com.sputnikgo.enums.Language language);
}