package com.mainul.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mainul.fleetapp.model.Contact;

@Repository
public interface ContractRepository extends JpaRepository<Contact, Integer> {

}
