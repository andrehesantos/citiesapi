package com.cities.resources;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cities.models.City;
import com.cities.repositories.CityRepository;

@RestController
@RequestMapping("/cities")
public class CityResource {

	private final CityRepository cr;
	
	public CityResource( final CityRepository cr) {
		this.cr = cr;
	}
	
	@GetMapping
	public Page<City> cities(final Pageable page){
		return cr.findAll(page);
	}
}
