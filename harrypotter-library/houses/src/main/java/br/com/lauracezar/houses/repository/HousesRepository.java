package br.com.lauracezar.houses.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.lauracezar.houses.model.Houses;

@Repository
public interface HousesRepository extends JpaRepository<Houses,Integer> {
    public Optional<Houses> findByName(String name);
}