package com.sputnikgo.model.driver;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.OffsetDateTime;

@Entity
@Table(name = "driver_documents")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DriverDocument {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "driver_id", nullable = false)
    private Driver driver;

    @Column(nullable = false, length = 32)
    private String type;

    @Column(length = 64)
    private String number;

    private OffsetDateTime issuedAt;
    private OffsetDateTime expiresAt;

    @Column(length = 255)
    private String fileUrl;

    @Column(nullable = false)
    private Boolean verified = false;
}
