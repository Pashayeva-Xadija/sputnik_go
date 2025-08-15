package com.sputnikgo.dto.driver;
import com.sputnikgo.enums.VehicleCategoryCode;
import lombok.Data;
@Data
    public class NearbyDriversDto {
        private Long driverId;
        private Double latitude;
        private Double longitude;
        private VehicleCategoryCode vehicleCategory;
    }

