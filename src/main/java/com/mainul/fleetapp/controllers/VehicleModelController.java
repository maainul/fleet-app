package com.mainul.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleModelController {

	@GetMapping("/vehicle-movement")
	public String getCountries() {
		return "vehicleMovement";
	}
}
