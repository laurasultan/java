package br.com.lauracezar.affiliations.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.lauracezar.affiliations.model.Affiliations;

@Repository
public interface AffiliationsRepository extends JpaRepository<Affiliations,Integer> {
    public Optional<Affiliations> findByName(String name);
}