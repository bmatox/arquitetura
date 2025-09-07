package org.example.arquiteturas.hexagonal.serviceImpl;

import lombok.RequiredArgsConstructor;
import org.example.arquiteturas.hexagonal.models.Produto;
import org.example.arquiteturas.hexagonal.models.Stock;
import org.example.arquiteturas.hexagonal.repository.ProdutoRepository;
import org.example.arquiteturas.hexagonal.services.ProdutoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProdutoServiceImpl implements ProdutoService {

    private final ProdutoRepository produtoRepository;

    @Override
    public Produto createProduto(Produto produto) {
        Stock novoStock = new Stock();
        novoStock.setProduto(produto);
        novoStock.setQuantidade(0);
        produto.setStock(novoStock);

        return produtoRepository.save(produto);
    }

    @Override
    public List<Produto> getAllProdutos() {
        return produtoRepository.findAll();
    }

    @Override
    public Produto getProdutoById(Long id) {
        return produtoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Produto não encontrado com o ID: " + id));
    }
}