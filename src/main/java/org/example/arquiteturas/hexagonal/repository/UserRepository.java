package org.example.arquiteturas.hexagonal.repository;

import org.example.arquiteturas.hexagonal.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
