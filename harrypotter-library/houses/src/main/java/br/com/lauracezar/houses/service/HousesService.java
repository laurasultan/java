package br.com.lauracezar.houses.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.lauracezar.houses.model.Houses;
import br.com.lauracezar.houses.model.Validation;
import br.com.lauracezar.houses.repository.HousesRepository;

@Service
public class HousesService {
    @Autowired
    private HousesRepository repository;

    public List<Houses> findAll() {
        return repository.findAll();
    }

    public Houses save(Houses houses) throws IllegalArgumentException {
        if(!Validation.nameValidation(houses.getName())) {
            throw new IllegalArgumentException("O nome é inválido. O mesmo deve conter de 2 à 100 caracteres.");
        }
        if(!Validation.nameValidation(houses.getAnimal())) {
            throw new IllegalArgumentException("O animal é inválido. O mesmo deve conter de 2 à 50 caracteres.");
        }
        if(!Validation.nameValidation(houses.getColor())) {
            throw new IllegalArgumentException("A cor é inválida. A mesma deve conter de 2 à 50 caracteres.");
        }
        if(!Validation.nameValidation(houses.getValue())) {
            throw new IllegalArgumentException("Os valores são inválidos. Os mesmos devem conter de 2 à 50 caracteres.");
        }
        return repository.save(houses);
    }

    public Optional<Houses> findOne(Integer code) {
        return repository.findById(code);
    }
}