package org.example.arquiteturas.hexagonal.controllers;

import lombok.RequiredArgsConstructor;
import org.example.arquiteturas.hexagonal.models.User;
import org.example.arquiteturas.hexagonal.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cadastrar_usuario") // ELE ESTÁ AQUI PARA DEFINIR O CAMINHO BASE PARA TODOS OS ENDPOINTS DESTE CONTROLADOR
@RequiredArgsConstructor
public class UserController {

    private final UserService userService; // ESSE É UM USO PRATICO DE UM DOS PILARES DA POO, QUE É O POLIMORFISMO, POIS AQUI ESTAMOS USANDO A INTERFACE UserService, MAS NA HORA DE INSTANCIAR VAI SER USADO A CLASSE UserServiceImpl

    @PostMapping("/create")
    public ResponseEntity<User> CreateUser(@RequestBody User user) {

        return ResponseEntity.ok(userService.createUser(user)); //
    }
    @GetMapping("/allUsers")
    public ResponseEntity<List<User>> GetAllUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> GetUserById(@RequestParam Long id) {
        return ResponseEntity.ok(userService.getUserById(id));
    }
}
