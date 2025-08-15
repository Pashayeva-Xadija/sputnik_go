package com.sputnikgo.mapper;

import com.sputnikgo.dto.support.SupportArticleDto;
import com.sputnikgo.model.support.SupportArticle;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SupportArticleMapper {
    SupportArticleDto toDto(SupportArticle entity);
}
