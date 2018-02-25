package com.tomek.controller;

import com.tomek.domain.User;
import com.tomek.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import sun.misc.Contended;

@Controller
@RequestMapping(path = "/app")
public class MainController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(path = "/add")
    public String addUser(){

        User user = new User();
        user.setId(1L);
        user.setLastName("last");
        user.setFirstName("first");
        userRepository.save(user);
        return "added";
    }
}
