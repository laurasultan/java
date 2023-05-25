package br.com.lauracezar.characters.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.lauracezar.characters.model.Characters;
import br.com.lauracezar.characters.model.Validation;
import br.com.lauracezar.characters.repository.CharactersRepository;

@Service
public class CharactersService {
    @Autowired
    private CharactersRepository repository;

    public List<Characters> findAll() {
        return repository.findAll();
    }

    public Characters save(Characters characters) throws IllegalArgumentException {
        if(!Validation.nameValidation(characters.getName())) {
            throw new IllegalArgumentException("O nome é inválido. O mesmo deve conter de 3 à 100 caracteres.");
        }
        if(!Validation.nameValidation(characters.getHouse())) {
            throw new IllegalArgumentException("A casa é inválida. A mesma deve conter de 3 à 50 caracteres.");
        }
        if(!Validation.nameValidation(characters.getAffiliation())) {
            throw new IllegalArgumentException("A filiação, ou filiações são inválidas. As mesmas devem conter de 3 à 300 caracteres.");
        }
        return repository.save(characters);
    }

    public Optional<Characters> findOne(Integer code) {
        return repository.findById(code);
    }
}