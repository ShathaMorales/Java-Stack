package com.codingdojo.dojosandninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.dojosandninjas.models.Dojo;
import com.codingdojo.dojosandninjas.repositories.DojoRepository;

@Service
public class DojoService {
	// adding the dojo repository as a dependency
    private final DojoRepository dojoRepository;
   
    public DojoService(DojoRepository dojoRepository) {
        this.dojoRepository = dojoRepository;
    }
    
    // returns all the dojos
    public List<Dojo> allDojos() {
        return dojoRepository.findAll();
    }
    
    // adds a dojo
    public Dojo addDojo(Dojo dojo) {
        return dojoRepository.save(dojo);
    }
    
    // retrieves a dojo
    public Dojo findDojo(Long id) {
        Optional<Dojo> optionalDojo = dojoRepository.findById(id);
        if(optionalDojo.isPresent()) {
            return optionalDojo.get();
        } else {
            return null;
        }
    }
    
    // updates a dojo
    public Dojo updateDojo(Dojo dojo) {
        return dojoRepository.save(dojo);
    }
    
    //deletes a dojo
    public void deleteDojo(Long id) {
    	dojoRepository.deleteById(id);
    }
    
}
