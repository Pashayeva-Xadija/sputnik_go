package com.sputnikgo.model.support;


import com.sputnikgo.enums.ArticleCategory;
import com.sputnikgo.enums.Language;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "support_articles")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SupportArticle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 160)
    private String title;

    @Lob
    @Column(nullable = false)
    private String content;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Language language;

    @Column(nullable = false)
    private Boolean published = true;

    @Column(length = 80, unique = true)
    private String slug;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ArticleCategory category = ArticleCategory.GUIDE;
}
