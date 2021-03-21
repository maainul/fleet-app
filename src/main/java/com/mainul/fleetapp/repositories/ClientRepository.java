package com.mainul.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mainul.fleetapp.model.Client;

public interface ClientRepository extends JpaRepository<Client, Integer> {

}
