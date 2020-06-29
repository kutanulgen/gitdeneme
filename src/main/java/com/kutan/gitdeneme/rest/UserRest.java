package com.kutan.gitdeneme.rest;

import com.kutan.gitdeneme.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRest {

    @GetMapping("/user")
    public User getUSer1() {
        return new User(1, "user1");
    }

    @GetMapping("/user2")
    public User getUser2() {
        return new User(2, "user2");
    }

    @GetMapping("/user4")
    public User getUser4() {
        return new User(4, "user4");
    }

    @GetMapping("/user3")
    public User getUser3() {
        return new User(3, "user3");
    }
}
