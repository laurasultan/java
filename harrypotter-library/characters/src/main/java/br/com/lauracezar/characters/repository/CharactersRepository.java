package br.com.lauracezar.characters.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.lauracezar.characters.model.Characters;

@Repository
public interface CharactersRepository extends JpaRepository<Characters,Integer> {
    public Optional<Characters> findByName(String name);
}