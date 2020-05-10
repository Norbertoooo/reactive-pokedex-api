package com.reactive.pokedex.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document @Data @AllArgsConstructor @NoArgsConstructor
public class Pokemon {

    @Id
    private String id;
    private String nome;
    private String categoria;
    private String habilidades;
    private Double peso;
}
