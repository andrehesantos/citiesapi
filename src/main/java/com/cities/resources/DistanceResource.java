package com.cities.resources;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/distances")
public class DistanceResource {

	Logger log = LoggerFactory.getLogger(DistanceResource.class);

	private final DistanceService service;
	
	public DistanceResource(DistanceService service) {
		this.service = service;
	}
	
	@GetMapping("/by-points")
	public Double byPoints(@RequestParam(name = "from") final Long city1, @RequestParam(name = "to") final Long city2) {
		log.info("byPoints");
		return service.DistanceByPoints(city1, city2);
	}
	
	@GetMapping("/by-cube")
	public Double byCube(@RequestParam(name = "from") final Long city1, @RequestParam(name = "to") final Long city2) {
		log.info("byPoints");
		return service.DistanceByCube(city1, city2);
	}
}