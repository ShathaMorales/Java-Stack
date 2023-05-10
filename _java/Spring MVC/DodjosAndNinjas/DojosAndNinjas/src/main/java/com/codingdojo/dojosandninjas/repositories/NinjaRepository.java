package com.codingdojo.dojosandninjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.dojosandninjas.models.Ninja;

public interface NinjaRepository extends CrudRepository <Ninja, Long>{
    // this method retrieves all the ninjas from the database
    List<Ninja> findAll();
//    // this method finds ninjas with descriptions containing the search string
//    List<Ninja> findByDescriptionContaining(String search);
//    // this method counts how many ninjas contain a certain string
//    Long countByTitleContaining(String search);
//    // this method deletes a ninja that starts with a specific name
//    Long deleteByTitleStartingWith(String search);
}