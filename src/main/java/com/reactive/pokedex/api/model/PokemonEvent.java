package com.reactive.pokedex.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class PokemonEvent {
    private Long eventId;
    private String eventType;
}
