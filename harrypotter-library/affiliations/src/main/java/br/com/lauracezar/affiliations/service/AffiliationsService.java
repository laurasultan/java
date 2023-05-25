package br.com.lauracezar.affiliations.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.lauracezar.affiliations.model.Affiliations;
import br.com.lauracezar.affiliations.model.Validation;
import br.com.lauracezar.affiliations.repository.AffiliationsRepository;

@Service
public class AffiliationsService {
    @Autowired
    private AffiliationsRepository repository;

    public List<Affiliations> findAll() {
        return repository.findAll();
    }

    public Affiliations save(Affiliations affiliations) throws IllegalArgumentException {
        if(!Validation.nameValidation(affiliations.getName())) {
            throw new IllegalArgumentException("O nome é inválido. O mesmo deve conter de 3 à 50 caracteres.");
        }
        return repository.save(affiliations);
    }

    public Optional<Affiliations> findOne(Integer code) {
        return repository.findById(code);
    }
}