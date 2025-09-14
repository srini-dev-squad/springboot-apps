package com.spring.jwt.jwtauth.repositories;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

@Component
public class UserRepository {

    public UserDetails findByUsername(String userName) {
        if (userName == null) {
            return null;
        }
        UserDetails user = User.withUsername("srini")
                .password("$2a$10$YNVjbQ8.ED56JpsvUGOqCuDIH3ipdAmOEnOCI5K5T6RyYKvIrnoFG") // "password is test and encoded string is $2a$10$YNVjbQ8.ED56JpsvUGOqCuDIH3ipdAmOEnOCI5K5T6RyYKvIrnoFG"
                .roles("USER")
                .build();
        return user;
    }
}
