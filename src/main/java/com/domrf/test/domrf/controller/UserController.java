package com.domrf.test.domrf.controller;

import com.domrf.test.domrf.model.User;
import com.domrf.test.domrf.repository.UserRepository;
import com.domrf.test.domrf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/users")
    private List<User> getAllUser() {
        return userService.getAllUsers();
    }

    @GetMapping("/find/{id}")
    private User getUser(@PathVariable("id") int id) {
        return userService.findById(id);
    }

    @PostMapping("/save")
    private int saveUser(@RequestBody User user)
    {
        userService.saveOrUpdate(user);
        return user.getId();
    }

    @DeleteMapping("/delete/{id}")
    private void deleteUsers(@PathVariable("id") int id) {
        userService.delete(id);
    }

    @PutMapping("/update")
    private User update(@RequestBody User user)
    {
        userService.saveOrUpdate(user);
        return user;
    }

}
