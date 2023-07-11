package com.example.sendtoelastikbeanstalk;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController

@RequestMapping("user/")
public class controller {

    @PostMapping
    public ResponseEntity<User> postUser(@RequestBody User user){
        return ResponseEntity.ok(user);
    }


    @GetMapping
    public ResponseEntity<List<User>> getUsers(){

        List<User> users=  List.of(new User("diako","diako@gmailc"), new User("kalle","kalle.gemail"));
        return ResponseEntity.ok(users);
    }
}
