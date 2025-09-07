package org.example.arquiteturas.hexagonal.services;

import org.example.arquiteturas.hexagonal.models.User;

import java.util.List;

public interface UserService {
    public User createUser(User user);
    public List<User> getAllUsers();
    public User getUserById(Long id);
}
