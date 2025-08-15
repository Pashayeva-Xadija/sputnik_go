package com.sputnikgo.mapper;


import com.sputnikgo.dto.trip.ChatMessageDto;
import com.sputnikgo.dto.trip.TripResponse;
import com.sputnikgo.dto.trip.TripShortDto;
import com.sputnikgo.enums.RoutePointType;
import com.sputnikgo.model.trip.RoutePoint;
import com.sputnikgo.model.trip.Trip;
import com.sputnikgo.model.trip.TripMessage;
import com.sputnikgo.repository.RoutePointRepository;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface TripMapper {

    @Mappings({
            @Mapping(target = "tripId",        source = "id"),
            @Mapping(target = "status",        source = "status"),
            @Mapping(target = "estimatedPrice",source = "estimatedPrice"),
            @Mapping(target = "driverName",    source = "driver.user.fullName"),
            @Mapping(target = "vehicleModel",  source = "driver.vehicle.model"),
            @Mapping(target = "plateNumber",   source = "driver.vehicle.plateNumber")
    })
    TripResponse toResponse(Trip trip);


    @Mappings({
            @Mapping(target = "id",          source = "id"),
            @Mapping(target = "createdAt",   source = "createdAt"),
            @Mapping(target = "category",    source = "category"),
            @Mapping(target = "total",       source = "finalPrice"),
            @Mapping(target = "fromAddress", ignore = true),
            @Mapping(target = "toAddress",   ignore = true)
    })
    TripShortDto toShortDto(Trip trip, @Context RoutePointRepository routePointRepository);

    @AfterMapping
    default void fillAddresses(Trip trip,
                               @MappingTarget TripShortDto dto,
                               @Context RoutePointRepository repo) {
        RoutePoint from = repo.findFirstByTripIdAndTypeOrderBySequenceNoAsc(
                trip.getId(), RoutePointType.PICKUP);
        if (from != null) dto.setFromAddress(from.getAddress());

        RoutePoint to = repo.findFirstByTripIdAndTypeOrderBySequenceNoDesc(
                trip.getId(), RoutePointType.DROPOFF);
        if (to != null) dto.setToAddress(to.getAddress());
    }


    @Mappings({
            @Mapping(target = "tripId",   source = "trip.id"),
            @Mapping(target = "senderId", source = "sender.id"),
            @Mapping(target = "createdAt",source = "createdAt")
    })
    ChatMessageDto toDto(TripMessage entity);
}