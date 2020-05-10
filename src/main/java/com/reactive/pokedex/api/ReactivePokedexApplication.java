package com.reactive.pokedex.api;

import com.reactive.pokedex.api.model.Pokemon;
import com.reactive.pokedex.api.repository.PokemonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.ReactiveMongoOperations;
import reactor.core.publisher.Flux;

@SpringBootApplication
public class ReactivePokedexApplication {

    @Bean
    CommandLineRunner init (ReactiveMongoOperations operations, PokemonRepository repository) {
        return args -> {
            Flux<Pokemon> pokemonFlux = Flux.just(
                    new Pokemon(null, "Bulbassauro", "Semente", "OverGrow", 6.09),
                    new Pokemon(null, "Charizard", "Fogo", "Blaze", 90.05),
                    new Pokemon(null, "Caterpie", "Minhoca", "Poeira do Escudo", 2.09),
                    new Pokemon(null, "Blastoise", "Marisco", "Torrente", 6.09))
                    .flatMap(repository::save);

            pokemonFlux
                    .thenMany(repository.findAll())
                    .subscribe(System.out::println);
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(ReactivePokedexApplication.class, args);
    }

}
