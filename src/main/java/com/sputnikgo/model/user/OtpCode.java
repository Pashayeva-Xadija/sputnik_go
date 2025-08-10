package com.sputnikgo.model.user;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.OffsetDateTime;

@Entity
@Table(name = "otp_codes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OtpCode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 32)
    private String phone;

    @Column(nullable = false, length = 8)
    private String code;

    @Column(length = 32)
    private String purpose;

    @Column(nullable = false)
    private OffsetDateTime expiresAt;
    private OffsetDateTime consumedAt;
}

