package com.reactive.pokedex.api.service;

import com.reactive.pokedex.api.model.Pokemon;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


public interface PokemonService {
    /**
     *  Metodo para visualizar todos os pokemons registrados
     * @return ResponseEntity<Flux<Pokemon>>
     */
    Flux<Pokemon> getAllPokemons();

    /**
     *  Metodo para visualizar um determinado pokemon pelo id informado
     * @param id
     * @return Mono<Pokemon>
     */
    Mono<Pokemon> getPokemon(String id);

    /**
     *  Metodo para salvar no bando de dados um pokemon
     * @param pokemon
     * @return Mono<Pokemon>
     */
    Mono<Pokemon> savePokemon(Pokemon pokemon);

    /**
     *  Metodo para atualizar dados de um pokemon ja existente no banco de dados
     * @param id
     * @param pokemon
     * @return Mono<Pokemon>
     */
    Mono<Pokemon> updatePokemon(String id, Pokemon pokemon);

    /**
     *  Metodo para deletar um pokemon pelo id informado do banco de dados
     * @param pokemon
     * @return Mono
     */
    Mono<Void> deletePokemon(Pokemon pokemon);

    /**
     *  Metodo para deletar todos os pokemons no banco de dados
     * @return Void
     */
    Mono<Void> deleteAllPokemons();

}
