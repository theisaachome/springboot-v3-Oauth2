package com.isaachome.demo.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "clients")
@Getter
@Setter
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;
    @Column(name = "client_id")
    private String clientID;
    @Column(name = "secret")
    private  String secret;
    @Column(name = "authorization")
    private  String authorization;

    @OneToMany(mappedBy = "client")
    private List<GrantType> grantTypes;

    @OneToMany(mappedBy = "client")
    private List<RedirectUrl> redirectUrls;

    @OneToMany(mappedBy = "client")
    private List<Scope> scopes;

}
