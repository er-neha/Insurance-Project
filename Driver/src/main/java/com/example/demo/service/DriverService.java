package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Driver;
import com.example.demo.repo.DriverRepo;

@Service
public class DriverService {

	@Autowired
	private DriverRepo driverRepo;

	public Driver saveDriverDetails(Driver driver) {
		return driverRepo.save(driver);
	}

	public Optional<Driver> getDriverById(int id) {
		return driverRepo.findById(id);
	}

	public Driver updateDriver(Driver driver, int driverId) {
		driver.setDriverId(driverId);
		return driverRepo.save(driver);
	}

	public void deleteById(int driverId) {
		driverRepo.deleteById(driverId);

	}

}
