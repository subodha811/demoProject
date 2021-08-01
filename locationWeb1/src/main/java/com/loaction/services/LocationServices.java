package com.loaction.services;

import java.util.List;

import com.loaction.entities.Location;

public interface LocationServices {
	public void  saveLocation(Location location);
	public List<Location> getAllLocation();
	public void deleteLocationById(Long id);
	public Location getLocationById(Long id);
}
