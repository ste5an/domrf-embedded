package com.domrf.test.domrf.controller;

import com.domrf.test.domrf.model.User;
import com.domrf.test.domrf.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Validated
@RestController
@RequestMapping("/rest/user")
@Api(value = "User Controller", description = "communication between the user and the system")
public class UserController {

    @Autowired
    UserService userService;

    @ApiOperation(value = "get all users")
    @GetMapping("/users")
    private List<User> getAllUser() {
        return userService.getAllUsers();
    }

    @ApiOperation(value = "find user by passportId")
    @GetMapping("/find/{passportId}")
    private User getUser(@PathVariable("passportId") int passportId) {
        return userService.findById(passportId);
    }

    @ApiOperation(value = "save user")
    @PostMapping("/save")
    private int saveUser(@Valid @RequestBody User user)
    {
        userService.saveOrUpdate(user);
        return user.getPassportId();
    }

    @ApiOperation(value = "update user")
    @PutMapping("/update")
    private User update(@RequestBody User user)
    {
        userService.saveOrUpdate(user);
        return user;
    }

    @ApiOperation(value = "delete user")
    @DeleteMapping("/delete/{passportId}")
    private void deleteUsers(@PathVariable("passportId") int passportId) {
        userService.delete(passportId);
    }



}
