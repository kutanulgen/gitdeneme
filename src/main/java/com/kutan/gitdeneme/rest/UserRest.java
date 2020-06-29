package com.kutan.gitdeneme.rest;

import com.kutan.gitdeneme.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRest {

    @GetMapping("/user")
    public User getUSer() {
        return new User(1, "user6");
    }
}
