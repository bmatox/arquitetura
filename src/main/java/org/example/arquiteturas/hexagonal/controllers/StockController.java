package org.example.arquiteturas.hexagonal.controllers;

import lombok.RequiredArgsConstructor;
import org.example.arquiteturas.hexagonal.models.Stock;
import org.example.arquiteturas.hexagonal.services.StockService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/stock")
@RequiredArgsConstructor
public class StockController {

    private final StockService stockService;

    @GetMapping("/{produtoId}")
    public ResponseEntity<Stock> getStockByProdutoId(@PathVariable Long produtoId) {
        return ResponseEntity.ok(stockService.getStockByProdutoId(produtoId));
    }

    @PutMapping("/{produtoId}")
    public ResponseEntity<Stock> updateStock(@PathVariable Long produtoId, @RequestParam Integer quantidade) {
        return ResponseEntity.ok(stockService.updateStock(produtoId, quantidade));
    }
}