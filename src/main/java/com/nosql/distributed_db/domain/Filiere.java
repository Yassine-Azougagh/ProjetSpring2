package com.nosql.distributed_db.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name="Filiere_view")

public class Filiere {
    @Id
    @Column(length = 6)
    private String ID;
    @Column(length = 30)
    private String Nom;
    @OneToMany(mappedBy = "filiere")
    @JsonManagedReference
    private Set<Etudiant> etudiants;
    @ManyToOne
    @JoinColumn(name="PROFESSEUR_CODE")
    @JsonBackReference
    Professeur professeur;

    public Filiere() {
        super();
    }

    public Filiere(String ID, String nom) {
        this.ID = ID;
        Nom = nom;
    }

    public Set<Etudiant> getEtudiants() {
        return etudiants;
    }

    public void setEtudiants(Set<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }

    public Professeur getProfesseur() {
        return professeur;
    }

    public void setProfesseur(Professeur professeur) {
        this.professeur = professeur;
    }
}
