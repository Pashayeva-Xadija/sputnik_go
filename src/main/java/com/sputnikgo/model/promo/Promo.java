package com.sputnikgo.model.promo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Entity
@Table(name = "promos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Promo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 32)
    private String code;

    @Column(length = 255)
    private String description;


    @Column(precision = 5, scale = 2)
    private BigDecimal percentOff;

    @Column(precision = 12, scale = 2)
    private BigDecimal amountOff;

    private OffsetDateTime startsAt;
    private OffsetDateTime endsAt;

    @Column(nullable = false)
    private Boolean active = true;

    private Integer usageLimit;
    private Integer perUserLimit;
}