package org.example.arquiteturas.hexagonal.services;

import org.example.arquiteturas.hexagonal.models.Produto;
import java.util.List;

public interface ProdutoService {
    Produto createProduto(Produto produto);
    List<Produto> getAllProdutos();
    Produto getProdutoById(Long id);
}