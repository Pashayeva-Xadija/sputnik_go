package com.sputnikgo.model.trip;


import com.sputnikgo.enums.VehicleCategoryCode;
import com.sputnikgo.model.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.OffsetDateTime;

@Entity
@Table(name = "scheduled_trips")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ScheduledTrip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "passenger_id", nullable = false)
    private User passenger;

    @Column(nullable = false)
    private Double pickupLat;

    @Column(nullable = false)
    private Double pickupLng;

    @Column(nullable = false)
    private Double dropoffLat;

    @Column(nullable = false)
    private Double dropoffLng;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private VehicleCategoryCode category;

    @Column(nullable = false)
    private OffsetDateTime scheduledFor;

    @Column(nullable = false)
    private Boolean active = true;

    private OffsetDateTime processedAt;
}
