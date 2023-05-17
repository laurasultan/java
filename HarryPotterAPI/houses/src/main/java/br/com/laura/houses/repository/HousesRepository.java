package br.com.laura.houses.repository;

import java.util.ArrayList;
import java.util.List;

import br.com.laura.houses.model.Houses;

public class HousesRepository {
    private static List<Houses> groups = new ArrayList<>();

    public List<Houses> findAll() {
        return groups;
    }

    public Houses save(Houses houses) {
        groups.add(houses);
        return houses;
    }

    public Houses edit(Houses houses) {
        for(int i = 0; i < groups.size(); i++) {
            Houses element = groups.get(i);
            if(element.getName().equals(houses.getName())) {
                groups.set(i, houses);
                break;
            }
        }
        return houses;
    }

    public Houses delete(Houses houses) {
        for(int i = 0; i < groups.size(); i++) {
            Houses element = groups.get(i);
            if(element.getName().equals(houses.getName())) {
                groups.remove(i);
            }
        }
        return houses;
    }
}