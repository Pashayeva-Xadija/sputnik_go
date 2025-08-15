package com.sputnikgo.mapper;

import com.sputnikgo.dto.schedule.ScheduledTripDto;
import com.sputnikgo.model.trip.ScheduledTrip;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ScheduledTripMapper {
    ScheduledTripDto toDto(ScheduledTrip entity);
}
