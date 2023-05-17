package br.com.laura.affiliations.repository;

import java.util.ArrayList;
import java.util.List;

import br.com.laura.affiliations.model.Affiliations;

public class AffiliationsRepository {
    private static List<Affiliations> connections = new ArrayList<>();

    public List<Affiliations> findAll() {
        return connections;
    }

    public Affiliations save(Affiliations affiliations) {
        connections.add(affiliations);
        return affiliations;
    }

    public Affiliations edit(Affiliations affiliations) {
        for(int i = 0; i < connections.size(); i++) {
            Affiliations element = connections.get(i);
            if(element.getName().equals(affiliations.getName())) {
                connections.set(i, affiliations);
                break;
            }
        }
        return affiliations;
    }

    public Affiliations delete(Affiliations affiliations) {
        for(int i = 0; i < connections.size(); i++) {
            Affiliations element = connections.get(i);
            if(element.getName().equals(affiliations.getName())) {
                connections.remove(i);
            }
        }
        return affiliations;
    }
}