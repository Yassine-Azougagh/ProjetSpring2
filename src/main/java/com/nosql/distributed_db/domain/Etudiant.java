package com.nosql.distributed_db.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="Etudiant_view")
public class Etudiant {
    @Id
    @Column(length = 10)
    private String CNE;
    @Column(length = 30)
    private String Nom;
    @Column(length = 30)
    private String Prenom;
    @Column(length = 50)
    private String Adresse;
    @ManyToOne
    @JoinColumn(name="FILIERE_ID")
    @JsonBackReference
    Filiere filiere;


    public Etudiant() {
        super();
    }

    public Etudiant(String CNE, String nom, String prenom, String adresse) {
        this.CNE = CNE;
        Nom = nom;
        Prenom = prenom;
        Adresse = adresse;
    }

    public Filiere getFiliere() {
        return filiere;
    }

    public void setFiliere(Filiere filiere) {
        this.filiere = filiere;
    }
}
