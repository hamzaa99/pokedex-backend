package com.example.pokedexapi.exeptions;

public class UserNotFoundExeption extends RuntimeException{
    public UserNotFoundExeption(Long id) {
        super("Could not find user " + id);
    }
}
