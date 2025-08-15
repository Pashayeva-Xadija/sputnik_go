package com.sputnikgo.model.promo;


import com.sputnikgo.model.trip.Trip;
import com.sputnikgo.model.user.User;
import jakarta.persistence.*;
import lombok.*;
import java.time.OffsetDateTime;

@Entity
@Table(name = "promo_redemptions")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class PromoRedemption {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false) @JoinColumn(name = "promo_id", nullable = false)
    private Promo promo;

    @ManyToOne(optional = false) @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne @JoinColumn(name = "trip_id")
    private Trip trip;

    @Column(nullable = false)
    private OffsetDateTime usedAt = OffsetDateTime.now();
}
