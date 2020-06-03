package com.domrf.test.domrf.repository;

import com.domrf.test.domrf.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface UserRepository extends CrudRepository<User, Integer> {

//    List<User> findAll();
}