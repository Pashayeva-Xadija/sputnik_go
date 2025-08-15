package com.sputnikgo.mapper;


import com.sputnikgo.dto.user.UserProfileDto;
import com.sputnikgo.model.user.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mappings({
            @Mapping(target = "id",        source = "id"),
            @Mapping(target = "fullName",  source = "fullName"),
            @Mapping(target = "phone",     source = "phone"),
            @Mapping(target = "language",  source = "language"),
            @Mapping(target = "email",     source = "profile.email"),
            @Mapping(target = "avatarUrl", source = "profile.avatarUrl")
    })
    UserProfileDto toDto(User user);
}