package com.domrf.test.domrf.controller;

import com.domrf.test.domrf.model.User;
import com.domrf.test.domrf.repository.UserRepository;
import com.domrf.test.domrf.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/user")
@Api(value = "User Controller", description = "communication between the user and the system")
public class UserController {

    @Autowired
    UserService userService;

    @ApiOperation(value = "getting all user records by using the method findAll() of CrudRepository")
    @GetMapping("/users")
    private List<User> getAllUser() {
        return userService.getAllUsers();
    }

    @ApiOperation(value = "getting specific record by using the method findById() of CrudRepository")
    @GetMapping("/find/{id}")
    private User getUser(@PathVariable("id") int id) {
        return userService.findById(id);
    }

    @ApiOperation(value = "saving specific record by using the method save() of CrudRepository")
    @PostMapping("/save")
    private int saveUser(@RequestBody User user)
    {
        userService.saveOrUpdate(user);
        return user.getId();
    }

    @ApiOperation(value = "update record")
    @PutMapping("/update")
    private User update(@RequestBody User user)
    {
        userService.saveOrUpdate(user);
        return user;
    }

    @ApiOperation(value = "deleting specific record by using the method deleteById() of CrudRepository")
    @DeleteMapping("/delete/{id}")
    private void deleteUsers(@PathVariable("id") int id) {
        userService.delete(id);
    }



}
