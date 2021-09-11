package com.example.pokedexapi.repositories;

import com.example.pokedexapi.enities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
