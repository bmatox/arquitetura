package org.example.arquitetura.repository;

import org.example.arquitetura.model.User; // Supondo que você tenha uma classe User no pacote model
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // O Spring já te dá save(), findById(), findAll(), deleteById(), etc.
    // Você pode adicionar consultas customizadas aqui se precisar.
}