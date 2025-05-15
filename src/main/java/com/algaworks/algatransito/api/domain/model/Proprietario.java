package com.algaworks.algatransito.api.domain.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Proprietario {
    private Long id;
    private String nome;
    private String telefone;
    private String email;
}
