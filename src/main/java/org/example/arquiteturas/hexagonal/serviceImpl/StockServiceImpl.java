package org.example.arquiteturas.hexagonal.serviceImpl;

import lombok.RequiredArgsConstructor;
import org.example.arquiteturas.hexagonal.models.Stock;
import org.example.arquiteturas.hexagonal.repository.StockRepository;
import org.example.arquiteturas.hexagonal.services.StockService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StockServiceImpl implements StockService {

    private final StockRepository stockRepository;
    private final ProdutoServiceImpl produtoService; // Injeção do serviço de Produto necessária para validação do produto


    @Override
    public Stock getStockByProdutoId(Long produtoId) {
        // Valida se o produto existe antes de buscar o estoque
        produtoService.getProdutoById(produtoId);
        return stockRepository.findByProdutoId(produtoId)
                .orElseThrow(() -> new RuntimeException("Estoque não encontrado para o produto com ID: " + produtoId));
    }

    @Override
    public Stock updateStock(Long produtoId, Integer quantidade) {
        Stock stock = getStockByProdutoId(produtoId);
        stock.setQuantidade(quantidade);
        return stockRepository.save(stock);
    }
}