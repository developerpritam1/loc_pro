package com.locationweb2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.locationweb2.dto.saveDatatoDTO;
import com.locationweb2.entities.Locations;
import com.locationweb2.repository.LocationRepository;
import com.locationweb2.service.LocationsServicesIMPl;

@Controller
public class LocationController {
     @Autowired
   private  LocationsServicesIMPl  locationService;
	@RequestMapping("/views")
	public String createlocatoin() {
		return "location_web";
		
	}
//	@RequestMapping("/saveLoc")
//	public String saveLocation(Locations location) {
//									/*    System.out.println(location.getId());
//								System.out.println(location.getName());
//								System.out.println(location.getCod045 e());
//							    System.out.println(location.getTypes());	*/	
//		repo.save(location);
//		
//		return "location_web";
////		
//	@RequestMapping("/saveLoc")
//	public String savleLocation(@RequestParam("id") long id,@RequestParam("name") String name,@RequestParam("code") String code,@RequestParam("types")String types) {
//
//		Locations location=new Locations();
//		location.setId(id);
//		location.setName(name);
//		location.setCode(code);
//		location.setTypes(types);
//		
//		
//		locationService.saveLocation(location);
//		
//		
//		
//		return "location_web";
	
	@RequestMapping("/saveLoc")
	
	public String saveLocation(saveDatatoDTO location ,ModelMap model) {
		
		Locations locations=new Locations();
		 
		locations.setId(location.getId());
		locations.setName(location.getName());
		locations.setCode(location.getCode());
		locations.setTypes(location.getTypes());
		
		
		 locationService.saveLocation(locations);
			model.addAttribute("saved", "successFully saved");
			
		 return "location_web";

	}
	@RequestMapping("/listall")
	public String listAllLocation(ModelMap model) {
		
		List<Locations> location = locationService.listAllLoc();
		model.addAttribute("locations",location);
		return "listall";
	}
	@RequestMapping("/delete")
	public String deleteLocationDataByID(@ModelAttribute("id") long id,ModelMap model)	{
		locationService.deleteById(id);
		
		
		List<Locations> location = locationService.listAllLoc();
		model.addAttribute("locations",location);
		return "listall";
		
	}
	
}

