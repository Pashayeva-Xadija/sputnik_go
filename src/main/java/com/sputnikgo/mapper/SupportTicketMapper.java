package com.sputnikgo.mapper;

import com.sputnikgo.dto.support.SupportTicketDto;
import com.sputnikgo.model.support.SupportTicket;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SupportTicketMapper {
    SupportTicketDto toDto(SupportTicket entity);
}