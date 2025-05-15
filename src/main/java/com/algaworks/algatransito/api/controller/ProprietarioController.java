package com.algaworks.algatransito.api.controller;

import com.algaworks.algatransito.api.domain.model.Proprietario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/proprietarios")
public class ProprietarioController {

    @GetMapping
    public List<Proprietario> listarProprietarios() {
        var proprietario1 = new Proprietario();
        proprietario1.setId(1L);
        proprietario1.setNome("João da Silva");
        proprietario1.setEmail("joao.silva@outlook.com");
        proprietario1.setTelefone("349999-5959");

        var proprietario2 = new Proprietario();
        proprietario2.setId(2L);
        proprietario2.setNome("Pedro da Silva");
        proprietario2.setEmail("pedro.silva@gmail.com");
        proprietario2.setTelefone("349999-9595");

        return Arrays.asList(proprietario1, proprietario2);
    }
}
