package com.cities.resources;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.geo.Point;
import org.springframework.stereotype.Service;

import com.cities.models.City;
import com.cities.repositories.CityRepository;

@Service
public class DistanceService {
	
	private final CityRepository cr;
	Logger log = LoggerFactory.getLogger(DistanceService.class);
	
	public DistanceService(final CityRepository cr) {
		this.cr = cr;
	}

	public Double DistanceByPoints(final Long city1,final Long city2) {
		log.info("nativePostgresInMiles({},{})",city1,city2);
		return cr.distanceByPoints(city1,city2 );
	}

	public Double DistanceByCube(Long city1, Long city2) {
		log.info("nativePostgresInMeters({},{})",city1,city2);
		final List<City> cities = cr.findAllById(Arrays.asList(city1,city2));
		Point p1 = cities.get(0).getLocalizacao();
		Point p2 = cities.get(1).getLocalizacao();
		return cr.distanceByCube(p1.getX(),p1.getY(),p2.getX(),p2.getY());
	}

}
