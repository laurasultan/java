package br.com.laura.affiliations.service;

import java.util.List;

import br.com.laura.affiliations.model.Affiliations;
import br.com.laura.affiliations.repository.AffiliationsRepository;

public class AffiliationsService {
    private AffiliationsRepository repository = new AffiliationsRepository();

    public List<Affiliations> findAll() {
        return repository.findAll();
    }

    public Affiliations save(Affiliations affiliations) throws IllegalArgumentException {
        if(affiliations.getName().trim().isEmpty()) {
            throw new IllegalArgumentException("NAME não pode ficar vazio.");
        }
        if(affiliations.getCode().trim().isEmpty()) {
            throw new IllegalArgumentException("CODE não pode ficar vazio.");
        }
        return repository.save(affiliations);   // return affiliations
    }

    public Affiliations edit(Affiliations affiliations) throws IllegalArgumentException {
        if(affiliations.getName().trim().isEmpty()) {
            throw new IllegalArgumentException("NAME não pode ficar vazio.");
        }
        if(affiliations.getCode().trim().isEmpty()) {
            throw new IllegalArgumentException("CODE não pode ficar vazio.");
        }
        return repository.edit(affiliations);
    }

    public Affiliations delete(Affiliations affiliations) {
        if(affiliations.getName().trim().isEmpty()) {
            throw new IllegalArgumentException("NAME não pode ficar vazio.");
        }
        return repository.delete(affiliations);
    }
}