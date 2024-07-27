package com.system.pos.controller;

import com.system.pos.dto.UserDTO;
import com.system.pos.model.User;
import com.system.pos.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping(value="/getAllUsers", method = RequestMethod.GET)
    public ResponseEntity<List<UserDTO>> getAllUser() {
        List<UserDTO> users = this.userService.getAllUser();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @RequestMapping(value="/addUser", method = RequestMethod.POST)
    public ResponseEntity<User> addUser(@RequestBody User user) {
        User user1 = this.userService.addUser(user);
        return new ResponseEntity<>(user1, HttpStatus.CREATED);
    }
    @GetMapping("/{userId}")
    public ResponseEntity<User> getUserByUserId(@PathVariable Integer userId) {
        User user = userService.getUserById(userId);

        if (user != null) {
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
