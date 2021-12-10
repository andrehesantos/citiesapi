package com.cities.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cities.models.State;

public interface StateRepository extends JpaRepository<State, Long>{

}
