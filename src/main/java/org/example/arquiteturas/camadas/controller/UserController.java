package org.example.arquiteturas.camadas.controller;

import org.example.arquiteturas.camadas.model.User;
import org.example.arquiteturas.camadas.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController // Essencial para criar uma API REST
@RequestMapping("/users") // Define a URL base para todos os endpoints deste controller
public class UserController {
    @Autowired
    private UserService service;

    /**
     * Endpoint para criar um novo usuário.
     * Mapeado para requisições HTTP POST na URL /users/create
     * @param obj O objeto User enviado no corpo (body) da requisição em formato JSON.
     * @return Uma resposta HTTP 200 (OK) com o usuário criado no corpo da resposta.
     */
    @PostMapping("/create")
    public ResponseEntity<User> createUser(@RequestBody User obj) {
        // 1. Chama o método do service para criar o usuário
        User createdUser = service.createUser(obj);

        // 2. Retorna uma resposta HTTP de sucesso (200 OK)
        //    com o usuário recém-criado no corpo da resposta.
        return ResponseEntity.ok(createdUser);
    }
}