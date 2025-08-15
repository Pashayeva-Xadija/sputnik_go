package com.sputnikgo.model.user;

import jakarta.persistence.*;
import lombok.*;
import java.time.OffsetDateTime;

@Entity
@Table(name = "user_consents")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class UserConsent {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(nullable = false, length = 32)
    private String policy;

    @Column(nullable = false, length = 16)
    private String version;

    @Column(nullable = false)
    private OffsetDateTime acceptedAt = OffsetDateTime.now();

    @Column(length = 64)
    private String ip;

    @Column(length = 128)
    private String deviceInfo;
}