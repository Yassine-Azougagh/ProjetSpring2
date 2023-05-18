package com.nosql.distributed_db.controller;

import com.nosql.distributed_db.domain.Professeur;
import com.nosql.distributed_db.service.ProfesseurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/professeur")
public class ProfesseurController {
    @Autowired
    private ProfesseurService professeurService;

    @GetMapping("/all")
    public ResponseEntity<List<Professeur>> getAllProfesseur(){
        List<Professeur> professeurs = this.professeurService.getAllProfesseur();
        return new ResponseEntity<>(professeurs, HttpStatus.OK);
    }

    @GetMapping("/update")
    public ResponseEntity<Integer> updateProfesseurs(){
        int rowAffected = this.professeurService.updateProfesseurs();
        return new ResponseEntity<>(rowAffected, HttpStatus.OK);    }


}
