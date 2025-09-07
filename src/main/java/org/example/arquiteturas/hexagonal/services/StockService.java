package org.example.arquiteturas.hexagonal.services;

import org.example.arquiteturas.hexagonal.models.Stock;

public interface StockService {
    Stock getStockByProdutoId(Long produtoId);
    Stock updateStock(Long produtoId, Integer quantidade);
}