package com.sputnikgo.mapper;

import com.sputnikgo.dto.driver.DriverCardDto;
import com.sputnikgo.model.driver.Driver;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface DriverMapper {
    @Mappings({
            @Mapping(target = "driverId",    source = "id"),
            @Mapping(target = "name",        source = "user.fullName"),
            @Mapping(target = "vehicleModel",source = "vehicle.model"),
            @Mapping(target = "plateNumber", source = "vehicle.plateNumber"),
            @Mapping(target = "avatarUrl",   source = "user.profile.avatarUrl"),
            @Mapping(target = "rating",      ignore = true)
    })
    DriverCardDto toCard(Driver driver);
}