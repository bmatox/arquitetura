package org.example.arquiteturas.camadas.service;

import org.example.arquiteturas.camadas.model.User;
import org.example.arquiteturas.camadas.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService { // O nome pode ser singular (UserService) ou plural (UserServices)

    // @Autowired é crucial para a injeção de dependência.
    // O Spring vai gerenciar a instância do UserRepository para nós.
    @Autowired
    private UserRepository repository;

    /**
     * Método para criar um novo usuário.
     * Recebe um objeto User e o passa para a camada de repositório para ser salvo.
     * @param obj O objeto User a ser salvo.
     * @return O objeto User salvo com o ID gerado pelo banco.
     */
    public User createUser(User obj) {
        // A mágica do Spring Data JPA acontece aqui.
        // O método save() já faz o INSERT no banco de dados.
        return repository.save(obj);
    }
}