package com.sputnikgo.model.user;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.OffsetDateTime;

@Entity
@Table(
        name = "referral_redemptions",
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "uk_referral_redemptions_code_user",
                        columnNames = {"code_id", "user_id"}
                )
        }
)
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class ReferralRedemption {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "code_id", nullable = false)
    private ReferralCode code;

    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(nullable = false)
    private OffsetDateTime usedAt = OffsetDateTime.now();
}