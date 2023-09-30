package com.isaachome.demo.repos;

import com.isaachome.demo.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepos extends JpaRepository<Client,Integer> {
}
