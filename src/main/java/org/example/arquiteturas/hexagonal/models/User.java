package org.example.arquiteturas.hexagonal.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class User {

    private Long id;
    private String nome;
    private String email;
}
