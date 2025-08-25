package org.example.arquitetura.model;

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
