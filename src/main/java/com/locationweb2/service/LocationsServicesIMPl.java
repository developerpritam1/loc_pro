package com.locationweb2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.locationweb2.entities.Locations;
import com.locationweb2.repository.LocationRepository;
@Service
public class LocationsServicesIMPl implements LocationServices {

	@Autowired
	LocationRepository locationRepository;
	
	@Override
	public void saveLocation(Locations location) {
		locationRepository.save(location);
	}

	@Override
	public List<Locations> listAllLoc() {
		
		List<Locations> location = locationRepository.findAll();
		
		
		return  location ;
	}

	public void deleteById(long id) {
		
		locationRepository.deleteById(id);
		
	}

	
	}

