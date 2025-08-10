package com.sputnikgo.dto.driver;

import lombok.Data;

@Data
public class DriverCardDto {
    private Long driverId;
    private String name;
    private Double rating;
    private String vehicleModel;
    private String plateNumber;
    private String avatarUrl;
}


