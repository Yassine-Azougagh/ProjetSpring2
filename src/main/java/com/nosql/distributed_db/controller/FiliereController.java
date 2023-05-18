package com.nosql.distributed_db.controller;

import com.nosql.distributed_db.domain.Filiere;
import com.nosql.distributed_db.service.FiliereService;
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
@RequestMapping("/filiere")
public class FiliereController {
    @Autowired
    private FiliereService filiereService;
    @GetMapping("/all")
    public ResponseEntity<List<Filiere>> getAllFiliere(){
        List<Filiere> filieres = this.filiereService.getAllFiliere();
        return new ResponseEntity<>(filieres, HttpStatus.OK);
    }

    @GetMapping("/update")
    public ResponseEntity<Integer> updateFilieres(){
        int rowAffected =  this.filiereService.updateFilieres() ;
        return new ResponseEntity<>(rowAffected, HttpStatus.OK);
    }


}
