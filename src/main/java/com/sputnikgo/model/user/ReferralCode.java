package com.sputnikgo.model.user;

import com.sputnikgo.model.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.OffsetDateTime;

@Entity
@Table(
        name = "referral_codes",
        uniqueConstraints = {
                @UniqueConstraint(name = "uk_referral_codes_code", columnNames = {"code"})})
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ReferralCode {

    @Id
    @GeneratedValue
            (strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "issuer_id", nullable = false)
    private User issuer;

    @Column(nullable = false, length = 16)
    private String code;

    private Integer maxUses;
    private OffsetDateTime expiresAt;

    @Column(nullable = false)
    private Boolean active = true;
}
