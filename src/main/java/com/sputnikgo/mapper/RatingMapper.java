package com.sputnikgo.mapper;

import com.sputnikgo.dto.trip.RatingRequest;
import com.sputnikgo.dto.trip.RatingResponse;
import com.sputnikgo.model.rating.Rating;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface RatingMapper {

    @Mapping(target = "ratingId", source = "id")
    @Mapping(target = "tripId",   source = "trip.id")
    RatingResponse toDto(Rating entity);


    @Mapping(target = "id",     ignore = true)
    @Mapping(target = "trip",   ignore = true)
    @Mapping(target = "author", ignore = true)
    Rating toEntity(RatingRequest request);
}
