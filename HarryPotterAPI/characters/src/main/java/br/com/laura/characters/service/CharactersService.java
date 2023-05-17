package br.com.laura.characters.service;

import java.util.List;

import br.com.laura.characters.model.Characters;
import br.com.laura.characters.repository.CharactersRepository;

public class CharactersService {
    private CharactersRepository repository = new CharactersRepository();

    public List<Characters> findAll() {
        return repository.findAll();
    }

    public Characters save(Characters characters) throws IllegalArgumentException {
        if(characters.getName().trim().isEmpty()) {
            throw new IllegalArgumentException("NAME não pode ficar vazio.");
        }
        if(characters.getCode().trim().isEmpty()) {
            throw new IllegalArgumentException("CODE não pode ficar vazio.");
        }
        if(characters.getHouse().trim().isEmpty()) {
            throw new IllegalArgumentException("HOUSE não pode ficar vazio.");
        }
        if(characters.getAffiliation().trim().isEmpty()) {
            throw new IllegalArgumentException("AFFILIATION não pode ficar vazio.");
        }
        return repository.save(characters);   // return characters
    }

    public Characters edit(Characters characters) throws IllegalArgumentException {
        if(characters.getName().trim().isEmpty()) {
            throw new IllegalArgumentException("NAME não pode ficar vazio.");
        }
        if(characters.getCode().trim().isEmpty()) {
            throw new IllegalArgumentException("CODE não pode ficar vazio.");
        }
        if(characters.getHouse().trim().isEmpty()) {
            throw new IllegalArgumentException("HOUSE não pode ficar vazio.");
        }
        if(characters.getAffiliation().trim().isEmpty()) {
            throw new IllegalArgumentException("AFFILIATION não pode ficar vazio.");
        }
        return repository.edit(characters);
    }

    public Characters delete(Characters characters) {
        if(characters.getName().trim().isEmpty()) {
            throw new IllegalArgumentException("NAME não pode ficar vazio.");
        }
        return repository.delete(characters);
    }
}