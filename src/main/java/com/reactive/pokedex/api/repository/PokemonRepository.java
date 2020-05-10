package com.reactive.pokedex.api.repository;

import com.reactive.pokedex.api.model.Pokemon;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PokemonRepository extends ReactiveMongoRepository<Pokemon, String> {
}
