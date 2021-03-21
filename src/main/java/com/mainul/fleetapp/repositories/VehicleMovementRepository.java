package com.mainul.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mainul.fleetapp.model.Client;
import com.mainul.fleetapp.model.Country;
import com.mainul.fleetapp.model.Employee;
import com.mainul.fleetapp.model.VehicleMovement;

@Repository
public interface VehicleMovementRepository extends JpaRepository<VehicleMovement, Integer> {

}
