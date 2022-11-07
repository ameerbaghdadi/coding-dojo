package com.codingdojo.ninjadojo.services;

import java.util.List;

//...
import org.springframework.stereotype.Service;

import com.codingdojo.ninjadojo.models.Dojo;
import com.codingdojo.ninjadojo.models.Ninja;
import com.codingdojo.ninjadojo.repositories.DojoRepository;
import com.codingdojo.ninjadojo.repositories.NinjaRepository;

@Service
public class AppService {
 // adding the book repository as a dependency
 private final NinjaRepository ninjaRepository;
 private final DojoRepository dojoRepository;
 
 public AppService(NinjaRepository ninjaRepository, DojoRepository dojoRepository) {
     this.ninjaRepository = ninjaRepository;
     this.dojoRepository = dojoRepository;
 }
 
 public List<Dojo> allDojos() {
     return dojoRepository.findAll();
 }
 
public List<Ninja> allNinjas() {
   return ninjaRepository.findAll();
}
   
 public Dojo createDojo(Dojo d) {
     return dojoRepository.save(d);
 }
 
 public Ninja createNinja(Ninja n) {
     return ninjaRepository.save(n);
 }
 
 public Dojo findDojo(Long id) {
	 return this.dojoRepository.findById(id).orElse(null);
 }
}
