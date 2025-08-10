package com.sputnikgo.model.pricing;

import com.sputnikgo.enums.VehicleCategoryCode;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "vehicle_categories")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class VehicleCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, unique = true)
    private VehicleCategoryCode code;

    @Column(nullable = false, precision = 12, scale = 2)
    private BigDecimal baseFare;

    @Column(nullable = false, precision = 12, scale = 2)
    private BigDecimal perKm;

    @Column(nullable = false, precision = 12, scale = 2)
    private BigDecimal perMin;
}
