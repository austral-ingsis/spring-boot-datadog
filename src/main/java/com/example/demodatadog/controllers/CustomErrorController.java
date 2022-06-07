package com.example.demodatadog.controllers;

import com.example.demodatadog.models.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/custom/error")

public class CustomErrorController {

    public CustomErrorController() {
    }

    @RequestMapping
    public ResponseEntity<List<User>> getError(){
        throw new RuntimeException("As it was ment");
    }



}
