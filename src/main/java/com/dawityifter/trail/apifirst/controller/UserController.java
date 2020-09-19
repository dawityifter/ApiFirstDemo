package com.dawityifter.trail.apifirst.controller;

import com.dawityifter.trail.apifirst.api.UserApi;
import com.dawityifter.trail.apifirst.api.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Slf4j
public class UserController  implements UserApi {
    @Override
    public ResponseEntity<User> createUser(User user){
        log.info("creating User {}", user);
        user.setId(123L);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

}
