package org.example.arquiteturas.hexagonal.controllers;

import org.example.arquiteturas.hexagonal.models.User;
import org.example.arquiteturas.hexagonal.services.UserInterface;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cadastrar_usuario")
public class UserController {

    private UserInterface userInterface;

    @PostMapping("/create")
    public ResponseEntity<User> CreateUser(@RequestBody User user) {

        return ResponseEntity.ok(userInterface.createUser(user));
    }
    @GetMapping("/allUsers")
    public ResponseEntity<List<User>> GetAllUsers() {
        return ResponseEntity.ok(userInterface.getAllUsers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> GetUserById(@RequestParam Long id) {
        return ResponseEntity.ok(userInterface.getUserById(id));
    }
}
