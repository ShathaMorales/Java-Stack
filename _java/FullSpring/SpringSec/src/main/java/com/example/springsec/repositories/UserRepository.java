package com.example.springsec.repositories;

import com.example.springsec.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// imports removed for brevity
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}