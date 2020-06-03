package com.domrf.test.domrf.service;

import com.domrf.test.domrf.model.User;
import com.domrf.test.domrf.repository.UserRepository;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return Lists.newArrayList(userRepository.findAll());
    }

    public User findById(int passportId) {
        Optional<User> userOptional = userRepository.findById(passportId);
        if (userOptional.isPresent()) {
            return userOptional.get();
        } else throw new RuntimeException("User not found");
    }

    public void saveOrUpdate(User user) {
        userRepository.save(user);
    }

    public void delete(int passportId) {
        userRepository.deleteById(passportId);
    }

    public void update(User user, int passportId) {
        userRepository.save(user);
    }



}


