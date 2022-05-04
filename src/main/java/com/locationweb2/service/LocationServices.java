package com.locationweb2.service;

import java.util.List;

import com.locationweb2.entities.Locations;

public interface LocationServices {

	
	public void saveLocation(Locations location);
	List <Locations> listAllLoc();
}
