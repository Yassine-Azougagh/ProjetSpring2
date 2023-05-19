package com.nosql.distributed_db.controller;

import com.nosql.distributed_db.domain.Etudiant;
import com.nosql.distributed_db.service.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/etudiant")
public class EtudiantController {
    @Autowired
    private EtudiantService etudiantService;
    @GetMapping("/all")
    public ResponseEntity<List<Etudiant>> getAllEtudiant(){
        List<Etudiant> etudiants = this.etudiantService.getAllEtudiant();
        return new ResponseEntity<>(etudiants, HttpStatus.OK);
    }

    @GetMapping("/update")
    public ResponseEntity<Integer> updateEtudiants(){
        int rowAffected = this.etudiantService.updateEtudiants();
        return new ResponseEntity<>(rowAffected, HttpStatus.OK);
    }


}
