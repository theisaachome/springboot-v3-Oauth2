package com.isaachome.demo.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "grant_type")
@Getter
@Setter
public class GrantType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    @Column(name = "grant_type")
    private  String grantType;
    @ManyToOne
    private Client client;
}
