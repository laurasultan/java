package br.com.lauracezar.hogwarts.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.lauracezar.hogwarts.model.Character;
import br.com.lauracezar.hogwarts.model.Validation;
import br.com.lauracezar.hogwarts.repository.CharacterRepository;

@Service
public class CharacterService {
    @Autowired
    private CharacterRepository repository;

    public List<Character> findAll() {
        return repository.findAll();
    }

    public Character save(Character character) throws IllegalArgumentException {
        if(!Validation.nameValidation(character.getName())) {
            throw new IllegalArgumentException("O nome é inválido. O mesmo deve conter de 3 à 100 caracteres.");
        }
        if(!Validation.nameValidation(character.getHouse())) {
            throw new IllegalArgumentException("A casa é inválida. A mesma deve conter de 3 à 50 caracteres.");
        }
        // if(!Validation.nameValidation(character.getAffiliation())) {
        //     throw new IllegalArgumentException("A filiação, ou filiações são inválidas. As mesmas devem conter de 3 à 300 caracteres.");
        // }
        return repository.save(character);
    }

    public Optional<Character> findOne(Integer code) {
        return repository.findById(code);
    }

    public void delete(Integer code) {
        repository.deleteById(code);
    }
}