package com.sputnikgo.mapper;

import com.sputnikgo.dto.support.SupportMessageDto;
import com.sputnikgo.model.support.SupportMessage;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface SupportMessageMapper {
    @Mappings({
            @Mapping(target = "ticketId", source = "ticket.id"),
            @Mapping(target = "senderId", source = "sender.id")
    })
    SupportMessageDto toDto(SupportMessage entity);
}
