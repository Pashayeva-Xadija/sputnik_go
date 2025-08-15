package com.sputnikgo.mapper;

import com.sputnikgo.dto.contact.TrustedContactDto;
import com.sputnikgo.model.user.TrustedContact;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TrustedContactMapper {
    TrustedContactDto toDto(TrustedContact entity);
}
