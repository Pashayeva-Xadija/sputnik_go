package com.sputnikgo.dto.support;


import com.sputnikgo.enums.Language;
import lombok.Data;

@Data
public class SupportArticleDto {
    private Long id;
    private String title;
    private String content;
    private Language language;
}


