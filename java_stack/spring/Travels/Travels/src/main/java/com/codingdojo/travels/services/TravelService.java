package com.codingdojo.travels.services;

import java.util.List;
import java.util.Optional;

//...
import org.springframework.stereotype.Service;

import com.codingdojo.travels.models.Travel;
import com.codingdojo.travels.repositories.TravelRepository;
@Service
public class TravelService {
 // adding the book repository as a dependency
 private final TravelRepository travelRepository;
 
 public TravelService(TravelRepository travelRepository) {
     this.travelRepository = travelRepository;
 }
 // returns all the books
 public List<Travel> allTravels() {
     return travelRepository.findAll();
 }
 // creates a book
 public Travel createTravel(Travel b) {
     return travelRepository.save(b);
 }
 // retrieves a book
 public Travel findTravel(Long id) {
     Optional<Travel> optionalTravel = travelRepository.findById(id);
     if(optionalTravel.isPresent()) {
         return optionalTravel.get();
     } else {
         return null;
     }
 }
}