package org.example.arquiteturas.camadas.repository;

import org.example.arquiteturas.camadas.model.User; // Supondo que você tenha uma classe User no pacote model
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}