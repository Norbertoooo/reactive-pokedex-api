package com.reactive.pokedex.api.service.impl;

import com.reactive.pokedex.api.model.Pokemon;
import com.reactive.pokedex.api.repository.PokemonRepository;
import com.reactive.pokedex.api.service.PokemonService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Service
public class PokemonServiceImpl implements PokemonService {

    private final PokemonRepository pokemonRepository;

    public PokemonServiceImpl(PokemonRepository pokemonRepository) {
        this.pokemonRepository = pokemonRepository;
    }

    @Override
    public Flux<Pokemon> getAllPokemons() {
        return pokemonRepository.findAll();
    }

    @Override
    public Mono<Pokemon> getPokemon(String id) {
        return pokemonRepository.findById(id);
    }

    @Override
    public Mono<Pokemon> savePokemon(Pokemon pokemon) {
        return pokemonRepository.save(pokemon);
    }

    @Override
    public Mono<Pokemon> updatePokemon(String id, Pokemon pokemon) {
        return getPokemon(id).flatMap(novoPokemon -> {
            novoPokemon.setPeso(pokemon.getPeso());
            novoPokemon.setHabilidades(pokemon.getHabilidades());
            novoPokemon.setCategoria(pokemon.getCategoria());
            novoPokemon.setNome(pokemon.getNome());
            return savePokemon(novoPokemon);
        });
    }

    @Override
    public Mono<Void> deletePokemon( Pokemon pokemon) {
        return pokemonRepository.delete(pokemon);
    }

    @Override
    public Mono<Void> deleteAllPokemons() {
        return pokemonRepository.deleteAll();
    }
}
