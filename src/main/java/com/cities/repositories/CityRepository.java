package com.cities.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cities.models.City;

public interface CityRepository extends JpaRepository<City, Long>{

}
