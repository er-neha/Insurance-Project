package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Driver;
import com.example.demo.service.DriverService;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/driverr")
public class DiverController {

	@Autowired
	private DriverService driverService;

	@PostMapping("/savedriver")
	public ResponseEntity<Driver> saveDriverDetails(@RequestBody Driver driver) {
		Driver driver1 = driverService.saveDriverDetails(driver);
		return ResponseEntity.ok().body(driver1);
	}

	@GetMapping("/getdriverbyid/{id}")
	public ResponseEntity<Optional<Driver>> getDriveByID(@PathVariable("id") int driverId) {
		Optional<Driver> driver2 = driverService.getDriverById(driverId);
		return ResponseEntity.ok().body(driver2);
	}

	@PutMapping("/updatedriver/{id}")
	public Driver updateDriver(@RequestBody Driver driver, @PathVariable("id") int driverId) {
		return driverService.updateDriver(driver, driverId);
	}

	@DeleteMapping("deletebyid/{id}")
	public void deleteById(@PathVariable("id") int driverId) {
		driverService.deleteById(driverId);
	}
}
