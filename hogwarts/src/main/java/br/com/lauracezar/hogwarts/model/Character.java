package br.com.lauracezar.hogwarts.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "characters")
public class Character {
    @Id
    private int code;
    @Column(length = 50, nullable = false)
    private String name;
    @Column(length = 10, nullable = false)
    private String house;
    @Column(nullable = false)
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
        name = "character_affiliations",
        joinColumns = @JoinColumn(name="character_id"),
        inverseJoinColumns = @JoinColumn(name="affiliation_id")
    )
    // @Column(length = 200, nullable = false)
    private List<Affiliation> affiliation;
    
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getHouse() {
        return house;
    }
    public void setHouse(String house) {
        this.house = house;
    }
    public List<Affiliation> getAffiliation() {
        return affiliation;
    }
    public void setAffiliation(List<Affiliation> affiliation) {
        this.affiliation = affiliation;
    }


}
