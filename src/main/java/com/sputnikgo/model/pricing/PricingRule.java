package com.sputnikgo.model.pricing;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Entity
@Table(name = "pricing_rules")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PricingRule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 64)
    private String name;

    @Column(precision = 6, scale = 3)
    private BigDecimal surgeMultiplier;

    private OffsetDateTime startsAt;
    private OffsetDateTime endsAt;


    private Double minDistanceKm;
    private Double maxDistanceKm;

    @Column(nullable = false)
    private Boolean active = true;
}
