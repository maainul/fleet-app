package com.mainul.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeTypeController {

	@GetMapping("/employee-type")
	public String getCountries() {
		return "employeeType";
	}
}
