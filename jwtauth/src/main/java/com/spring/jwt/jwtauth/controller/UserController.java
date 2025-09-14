package com.spring.jwt.jwtauth.controller;

import com.spring.jwt.jwtauth.services.CustomUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    CustomUserDetailsService customUserDetailsService;

    public UserController() {
    }

    @PostMapping("/getUserDetails")
    public UserDetails getUserDetails(@RequestBody String userName) throws AuthenticationException {
        UserDetails userDetails = customUserDetailsService.loadUserByUsername(userName);
        return userDetails;
    }

}



