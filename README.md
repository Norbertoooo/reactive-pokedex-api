[![Build Status](https://travis-ci.org/Norbertoooo/reactive-pokedex-api.svg?branch=master)](https://travis-ci.org/Norbertoooo/reactive-pokedex-api)
# Reactive Pokedex Api
Api pokedex utilizando spring web flux com java 8 e mongoDB

##### Para iniciar a aplicação localhost:
    
    mvnw
    
##### Para acessar a interface de documentação e teste do swagger:
    
    http://localhost:8081/swagger-ui.html
    
##### Para acessar o status da api:
    
    http://localhost:8081/actuator/health
    
## Endpoints

##### Para obter uma lista de pokemons envie uma requisicao do tipo GET para:

    http://localhost:8081/pokemons
    
##### Para obter um pokemon especifico envie uma requisicao do tipo GET com o id para:

    http://localhost:8081/pokemons/id
    
##### Registrar um novo pokemon envie uma requisicao do tipo POST para:

    http://localhost:8081/pokemons
    
##### Atualizar os dados de um pokemon envie uma requisicao do tipo PUT com o id e os dados para atualizar para:

    http://localhost:8081/pokemons/id

##### Deletar apenas um pokemon, envie uma requisicao do tipo DELETE com o id:

    http://localhost:8081/pokemons/id
        
##### Deletar todos os pokemons envie uma requisicao do tipo DELETE:

    http://localhost:8081/pokemons
    
    
