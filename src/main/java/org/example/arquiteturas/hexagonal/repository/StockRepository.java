package org.example.arquiteturas.hexagonal.repository;

import org.example.arquiteturas.hexagonal.models.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StockRepository extends JpaRepository<Stock, Long> {
    // Método para buscar o estoque pelo ID do produto (pode ser útil)
    Optional<Stock> findByProdutoId(Long produtoId);
}