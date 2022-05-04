package com.locationweb2.controller;

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

import com.locationweb2.entities.Locations;
import com.locationweb2.repository.LocationRepository;

@RestController
@RequestMapping("/location/api")
public class LocationRestController {
	@Autowired
	LocationRepository locationRepo;
	
	@GetMapping
	public List<Locations> getAllLocation(){
		
	List<Locations>	locations=locationRepo.findAll();
	return locations;
	}
	
	@PostMapping
	public void addLocations(@RequestBody Locations locations) {
		locationRepo.save(locations);
	}
	@DeleteMapping("/delete/{id}")
	public void deleteByID(@PathVariable("id")long id) {
		
		locationRepo.deleteById(id);
		
	}
	
	@PutMapping
	public void updatelocationBYapi(@RequestBody Locations locations) {
		locationRepo.save(locations);
		
		
	}

	
	

}
