package com.loaction.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.loaction.dto.UpdateLocation;
import com.loaction.entities.Location;
import com.loaction.services.LocationServices;
import com.loaction.util.Email;

@Controller
public class LocationController {
	@Autowired
	private Email email;
	@RequestMapping("/showLocation")
	public String showLocationPage() {
		return "showLocation";
	}
	@Autowired
	LocationServices locationService;
	@RequestMapping("/saveLocation")
	public String saveLocation(@ModelAttribute("location") Location location, ModelMap modelMap ) { //@ModelAttribute is like giving all the request to the location object reference variable  
		locationService.saveLocation(location);
		modelMap.addAttribute("msg","Record is saved!!");
		email.sendEmail("subodhapradhan811@gmail.com", "Confirmation Mail", "Dear user, \n Your location details are saved!!! ");
		return "showLocation";
	}
	@RequestMapping("/getLocation")
	public String getLocation(ModelMap modelMap) {
		List<Location> location = locationService.getAllLocation();
		modelMap.addAttribute("location",location);
		return "getLocation";
	}
	@RequestMapping("/deleteLocation")
	public String deleteLocation(@RequestParam("id") Long id,ModelMap modelMap) {
		locationService.deleteLocationById(id);

		List<Location> location = locationService.getAllLocation();
		modelMap.addAttribute("location",location);
		return "getLocation";
	}
	@RequestMapping("/updateLocation")
	public String updateLocation(@RequestParam("id") Long id,ModelMap modelMap) {
		Location location = locationService.getLocationById(id);
		modelMap.addAttribute("location",location);
		return "updateLocationInfo";
	}
	@RequestMapping("/updateLocationData")
	public String updateLocationData(UpdateLocation updateLocation,ModelMap modelMap) {
		Location location=new Location();
		location.setId(updateLocation.getId());
		location.setCode(updateLocation.getCode());
		location.setName(updateLocation.getName());
		location.setType(updateLocation.getType());
		locationService.saveLocation(location);
		List<Location> locations=locationService.getAllLocation();
		modelMap.addAttribute("location",locations);
		return "getLocation";
		
	}
}
