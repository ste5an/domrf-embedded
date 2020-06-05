package com.domrf.test.domrf.service;

import com.domrf.test.domrf.model.User;
import com.domrf.test.domrf.repository.UserRepository;
import com.google.common.collect.Lists;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserRepository userRepository;

    public ArrayList<User> getAllUsers() {
        ArrayList<User> users = Lists.newArrayList(userRepository.findAll());
        logger.info("Get users from DB: {}", users);
        return users;
    }

    public User findById(int passportId) {
        Optional<User> userOptional = userRepository.findById(passportId);
        logger.info("Get user by passportId from DB: {}", userOptional);
        if (userOptional.isPresent()) {
            return userOptional.get();
        } else throw new RuntimeException("User not found");

    }

    public void saveOrUpdate(User user) {
        userRepository.save(user);
        logger.info("Save user to DB: {}", user);

    }

    public void delete(int passportId) {
        userRepository.deleteById(passportId);
        logger.info("Delete user by passportId from DB: {}", passportId);

    }

    public void update(User user, int passportId) {
        userRepository.save(user);
        logger.info("Update user in DB: {}", user);
    }



}

