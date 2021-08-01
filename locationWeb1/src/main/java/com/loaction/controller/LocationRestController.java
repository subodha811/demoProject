package com.loaction.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loaction.entities.Location;
import com.loaction.repository.LocationRepository;

@RestController
public class LocationRestController {
	
	@Autowired
	LocationRepository locationRepo;
	
	@RequestMapping("/getLocationById/{id}")
	public Location getLocationById(@PathVariable("id") long id) {
		Optional<Location> findById = locationRepo.findById(id);
		Location location = findById.get();
		return location;
		
	}
}
