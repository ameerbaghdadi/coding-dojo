package com.codingdojo.queriesjoins.repositories;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.codingdojo.queriesjoins.models.Language;

public interface LanguageRepository extends CrudRepository<Language, Long>{
   
}
