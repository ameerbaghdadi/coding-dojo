package com.codingdojo.queriesjoins.repositories;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.codingdojo.queriesjoins.models.City;

public interface CityRepository extends CrudRepository<City, Long>{
   
}