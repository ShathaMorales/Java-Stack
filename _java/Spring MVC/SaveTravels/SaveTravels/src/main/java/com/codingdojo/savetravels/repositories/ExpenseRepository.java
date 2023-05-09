package com.codingdojo.savetravels.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.savetravels.models.Expense;

public interface ExpenseRepository extends CrudRepository <Expense, Long>{
    // this method retrieves all the expenses from the database
    List<Expense> findAll();
//    // this method finds expenses with descriptions containing the search string
//    List<Expense> findByDescriptionContaining(String search);
//    // this method counts how much expenses contain a certain string
//    Long countByTitleContaining(String search);
//    // this method deletes an expense that starts with a specific name
//    Long deleteByTitleStartingWith(String search);
}
