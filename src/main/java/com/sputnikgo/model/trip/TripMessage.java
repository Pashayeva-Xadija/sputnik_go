package com.sputnikgo.model.trip;


import com.sputnikgo.model.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.OffsetDateTime;

@Entity
@Table(name = "trip_messages")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TripMessage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false) @JoinColumn(name = "trip_id", nullable = false)
    private Trip trip;

    @ManyToOne(optional = false) @JoinColumn(name = "sender_id", nullable = false)
    private User sender;

    @Lob @Column(nullable = false)
    private String body;

    @Column(nullable = false)
    private OffsetDateTime createdAt = OffsetDateTime.now();
}
