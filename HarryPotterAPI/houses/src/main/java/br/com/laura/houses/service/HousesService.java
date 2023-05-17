package br.com.laura.houses.service;

import java.util.List;

import br.com.laura.houses.model.Houses;
import br.com.laura.houses.repository.HousesRepository;

public class HousesService {
    private HousesRepository repository = new HousesRepository();

    public List<Houses> findAll() {
        return repository.findAll();
    }

    public Houses save(Houses houses) throws IllegalArgumentException {
        if(houses.getName().trim().isEmpty()) {
            throw new IllegalArgumentException("NAME não pode ficar vazio.");
        }
        if(houses.getCode().trim().isEmpty()) {
            throw new IllegalArgumentException("CODE não pode ficar vazio.");
        }
        if(houses.getAnimal().trim().isEmpty()) {
            throw new IllegalArgumentException("ANIMAL não pode ficar vazio.");
        }
        if(houses.getColor().trim().isEmpty()) {
            throw new IllegalArgumentException("COLOR não pode ficar vazio.");
        }
        if(houses.getValue().trim().isEmpty()) {
            throw new IllegalArgumentException("VALUE não pode ficar vazio.");
        }
        return repository.save(houses);   // return houses
    }

    public Houses edit(Houses houses) throws IllegalArgumentException {
        if(houses.getName().trim().isEmpty()) {
            throw new IllegalArgumentException("NAME não pode ficar vazio.");
        }
        if(houses.getCode().trim().isEmpty()) {
            throw new IllegalArgumentException("CODE não pode ficar vazio.");
        }
        if(houses.getAnimal().trim().isEmpty()) {
            throw new IllegalArgumentException("ANIMAL não pode ficar vazio.");
        }
        if(houses.getColor().trim().isEmpty()) {
            throw new IllegalArgumentException("COLOR não pode ficar vazio.");
        }
        if(houses.getValue().trim().isEmpty()) {
            throw new IllegalArgumentException("VALUE não pode ficar vazio.");
        }
        return repository.edit(houses);
    }

    public Houses delete(Houses houses) {
        if(houses.getName().trim().isEmpty()) {
            throw new IllegalArgumentException("NAME não pode ficar vazio.");
        }
        return repository.delete(houses);
    }
}