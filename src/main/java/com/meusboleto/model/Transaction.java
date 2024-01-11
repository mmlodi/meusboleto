package com.meusboleto.model;

import javax.persistence.*;

@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    // other fields...

    @ManyToOne
    @JoinColumn(name = "acct", referencedColumnName = "id")
    private Account account;

    // Getters and setters
}