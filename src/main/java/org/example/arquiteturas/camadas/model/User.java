package org.example.arquiteturas.camadas.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class User {

    private Long id;
    private String nome;
    private String email;
}
