package br.com.lauracezar.hogwarts.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.lauracezar.hogwarts.model.Character;

@Repository
public interface CharacterRepository extends JpaRepository<Character,Integer> {
    // public Optional<Character> findByName(String name);
}