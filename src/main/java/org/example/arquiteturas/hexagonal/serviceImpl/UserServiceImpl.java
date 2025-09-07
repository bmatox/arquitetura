package org.example.arquiteturas.hexagonal.serviceImpl;
import lombok.RequiredArgsConstructor;
import org.example.arquiteturas.hexagonal.repository.UserRepository;
import org.example.arquiteturas.hexagonal.models.User;
import org.example.arquiteturas.hexagonal.services.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

// Regras de negócio são implementadas aqui
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    @Override
    public User createUser(User user) {
        return repository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return repository.findAll();
    }

    @Override
    public User getUserById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado com o ID: " + id));
    }
}
