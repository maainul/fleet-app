package com.mainul.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleHireController {

	@GetMapping("/vehicle-hire")
	public String getCountries() {
		return "vehicleHire";
	}
}
