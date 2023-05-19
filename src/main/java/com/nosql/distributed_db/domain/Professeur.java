package com.nosql.distributed_db.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name="Professeur_view")

public class Professeur {
    @Id
    private int Code;
    @Column(length = 30)
    private String Nom;
    @Column(length = 30)
    private String Prenom;
    @Column(length = 20)
    private String Specialite;
    @OneToMany(mappedBy = "professeur")
    @JsonManagedReference
    Set<Filiere> filieres;

    public Professeur() {
        super();
    }

    public Professeur(int code, String nom, String prenom, String specialite) {
        Code = code;
        Nom = nom;
        Prenom = prenom;
        Specialite = specialite;
    }

    public Set<Filiere> getFilieres() {
        return filieres;
    }

    public void setFilieres(Set<Filiere> filieres) {
        this.filieres = filieres;
    }
}
