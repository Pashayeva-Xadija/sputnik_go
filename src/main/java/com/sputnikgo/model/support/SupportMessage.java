package com.sputnikgo.model.support;

import com.sputnikgo.model.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.OffsetDateTime;

@Entity
@Table(name = "support_messages")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SupportMessage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ticket_id", nullable = false)
    private SupportTicket ticket;


    @ManyToOne
    @JoinColumn(name = "sender_id")
    private User sender;

    @Lob
    @Column(nullable = false)
    private String body;

    @Column(nullable = false)
    private OffsetDateTime createdAt = OffsetDateTime.now();
}
