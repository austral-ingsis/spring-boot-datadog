package com.example.demodatadog.controllers;

import com.example.demodatadog.models.User;
import com.example.demodatadog.services.UsersService;
import org.springframework.http.ResponseEntity;
import org.springframework.metrics.annotation.Timed;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/users")
@Timed("users_controller_time")
public class UsersController {

    private final UsersService userService;

    public UsersController(UsersService userService) {
        this.userService = userService;
    }

    @RequestMapping
    public ResponseEntity<List<User>> getUsers(){
        return  ResponseEntity.ok(userService.getUsers());
    }



}
