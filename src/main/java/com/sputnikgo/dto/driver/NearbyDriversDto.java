package com.sputnikgo.dto.driver;
import lombok.Data;
@Data
    public class NearbyDriversDto {
        private Long driverId;
        private Double latitude;
        private Double longitude;
        private String vehicleCategory;
    }

