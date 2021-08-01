package com.loaction.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loaction.entities.Location;
import com.loaction.repository.LocationRepository;
@Service
public class LocationServicesImpl implements LocationServices {
@Autowired
LocationRepository locationRepo;
	@Override
	public void saveLocation(Location location) {
		locationRepo.save(location);
	}
	@Override
	public List<Location> getAllLocation() {
		List<Location> findAll = locationRepo.findAll();
		return findAll;
	}
	@Override
	public void deleteLocationById(Long id) {
		locationRepo.deleteById(id);
	}
	@Override
	public Location getLocationById(Long id) {
		Location location = locationRepo.getById(id);
		
		return location;
	}

}
