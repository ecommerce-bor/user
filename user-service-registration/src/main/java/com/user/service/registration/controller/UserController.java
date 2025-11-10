package com.user.service.registration.controller;

import com.user.service.registration.entity.User;
import com.user.service.registration.service.UserService;
import jakarta.validation.Valid;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public ResponseEntity<User> saveUser(@RequestBody @Valid User user){
        return new ResponseEntity<>(userService.saveUser(user), HttpStatus.CREATED);
    }

    @GetMapping("/users")
    public ResponseEntity<List<User>> getAllUsers(){
        return new ResponseEntity<>(userService.getAllUsers(),HttpStatus.OK);
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Integer id){
        return new ResponseEntity<>(userService.findUserById(id),HttpStatus.OK);
    }

    @GetMapping("/user/count")
    public ResponseEntity<Long> getUserCount(){
        return new ResponseEntity<>(userService.countUsers(),HttpStatus.OK);
    }

    @PutMapping("/user/update")
    public ResponseEntity<User> updateUser(@RequestBody User user){
        return new ResponseEntity<>(userService.updateUser(user),HttpStatus.OK);
    }

    @DeleteMapping("/user/{id}")
    public ResponseEntity<String> deleteUserById(@PathVariable Integer id){
          return new ResponseEntity<>(userService.deletedUserById(id),HttpStatus.OK);
    }

}
