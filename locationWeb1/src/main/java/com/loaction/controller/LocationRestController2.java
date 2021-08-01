package com.loaction.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loaction.entities.Location;
import com.loaction.repository.LocationRepository;

@RestController
@RequestMapping("/locations")
public class LocationRestController2 {
	@Autowired
	LocationRepository locationRepo;
	
	@GetMapping
	public List<Location> getAllLocation(){
		List<Location> locations = locationRepo.findAll();
		return locations;	
	}
	@PostMapping
	public void saveLocation(@RequestBody Location location) {
		locationRepo.save(location);
	}
	@PutMapping
	public void updateLocation(@RequestBody Location location) {
		locationRepo.save(location);
	}
	@DeleteMapping("/deleteLocations/{id}")
	public void deleteLocation(@PathVariable long id) {
		locationRepo.deleteById(id);
	}
}
