package com.isaachome.demo.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "scope")
@Getter
@Setter
public class Scope {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "scopes")
    private String scope;
    @ManyToOne
    private  Client client;
}
