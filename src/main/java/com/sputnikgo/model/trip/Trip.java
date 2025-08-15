package com.sputnikgo.model.trip;


import com.sputnikgo.enums.TripStatus;
import com.sputnikgo.enums.VehicleCategoryCode;
import com.sputnikgo.model.driver.Driver;
import com.sputnikgo.model.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Entity
@Table(name = "trips")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Trip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "passenger_id", nullable = false)
    private User passenger;

    @ManyToOne
    @JoinColumn(name = "driver_id")
    private Driver driver;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TripStatus status;

    @Column(precision = 12, scale = 2)
    private BigDecimal estimatedPrice;

    @Column(precision = 12, scale = 2)
    private BigDecimal finalPrice;

    @CreationTimestamp
    @Column(nullable = false)
    private OffsetDateTime createdAt;

    private OffsetDateTime startedAt;
    private OffsetDateTime completedAt;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private VehicleCategoryCode category;

    @Column(length = 100)
    private String riderName;

    @Column(length = 32)
    private String riderPhone;
}


