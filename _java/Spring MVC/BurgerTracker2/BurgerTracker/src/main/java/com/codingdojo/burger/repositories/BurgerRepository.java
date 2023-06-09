package com.codingdojo.burger.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.burger.models.Burger;

@Repository
public interface BurgerRepository extends CrudRepository<Burger, Long>{
    // this method retrieves all the burgers from the database
    List<Burger> findAll();
     //this method finds burgers with descriptions containing the search string
//    List<Burger> findByDescriptionContaining(String search);
//    // this method counts how many titles contain a certain string
//    Long countByTitleContaining(String search);
//    // this method deletes a burger that starts with a specific title
//    Long deleteByTitleStartingWith(String search);
}
