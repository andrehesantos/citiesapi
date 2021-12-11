package com.cities.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cities.models.City;

public interface CityRepository extends JpaRepository<City, Long>{

	Double distanceByPoints(long city1, long city2);
	
	Double distanceByCube(double x, double y, double x2, double y2);

}
