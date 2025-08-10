package com.sputnikgo.model.support;


import com.sputnikgo.model.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.OffsetDateTime;

@Entity
@Table(name = "support_tickets")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SupportTicket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(nullable = false, length = 160)
    private String subject;

    @Column(nullable = false, length = 32)
    private String status = "OPEN";

    @Column(nullable = false)
    private OffsetDateTime createdAt = OffsetDateTime.now();

    private OffsetDateTime closedAt;
}


