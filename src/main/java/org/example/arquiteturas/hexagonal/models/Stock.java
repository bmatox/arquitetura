package org.example.arquiteturas.hexagonal.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "produto_id", referencedColumnName = "id") // Chave estrangeira para a tabela Produto

    private Produto produto;
    private Integer quantidade;
}