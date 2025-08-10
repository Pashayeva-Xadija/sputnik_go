package com.sputnikgo.model.driver;


import com.sputnikgo.enums.VehicleCategoryCode;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "vehicles")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 16)
    private String plateNumber;

    @Column(nullable = false, length = 64)
    private String brand;

    @Column(nullable = false, length = 64)
    private String model;

    private String color;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private VehicleCategoryCode category;
}
