package com.isaachome.demo.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "redirect_urls")
public class RedirectUrl {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    @Column(name = "grant_type")
    private  String url;
    @ManyToOne
    private  Client client;

}
