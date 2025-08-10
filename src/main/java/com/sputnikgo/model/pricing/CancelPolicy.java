package com.sputnikgo.model.pricing;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "cancel_policies")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CancelPolicy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(nullable = false)
    private Integer freeCancelSeconds = 120;


    @Column(precision = 5, scale = 2)
    private BigDecimal feePercent;

    @Column(precision = 12, scale = 2)
    private BigDecimal feeFixed;
}