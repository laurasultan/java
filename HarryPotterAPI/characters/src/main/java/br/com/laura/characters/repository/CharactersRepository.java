package br.com.laura.characters.repository;

import java.util.ArrayList;
import java.util.List;

import br.com.laura.characters.model.Characters;

public class CharactersRepository {
    private static List<Characters> people = new ArrayList<>();

    public List<Characters> findAll() {
        return people;
    }

    public Characters save(Characters characters) {
        people.add(characters);
        return characters;
    }

    public Characters edit(Characters characters) {
        for(int i = 0; i < people.size(); i++) {
            Characters element = people.get(i);
            if(element.getName().equals(characters.getName())) {
                people.set(i, characters);
                break;
            }
        }
        return characters;
    }

    public Characters delete(Characters characters) {
        for(int i = 0; i < people.size(); i++) {
            Characters element = people.get(i);
            if(element.getName().equals(characters.getName())) {
                people.remove(i);
            }
        }
        return characters;
    }
}