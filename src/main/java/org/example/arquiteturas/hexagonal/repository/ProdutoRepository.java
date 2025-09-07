package org.example.arquiteturas.hexagonal.repository;

import org.example.arquiteturas.hexagonal.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}