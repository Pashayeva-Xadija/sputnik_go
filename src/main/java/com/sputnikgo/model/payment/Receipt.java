package com.sputnikgo.model.payment;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
    @Entity
    @Table(name = "receipts")
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public class Receipt {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @OneToOne(optional = false)
        @JoinColumn(name = "payment_id", nullable = false, unique = true)
        private Payment payment;

        @Column(nullable = false, precision = 12, scale = 2)
        private BigDecimal amount;

        @Column(nullable = false)
        private OffsetDateTime issuedAt;
    }

