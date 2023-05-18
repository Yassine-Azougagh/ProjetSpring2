package com.nosql.distributed_db.service;

import com.nosql.distributed_db.domain.Professeur;
import com.nosql.distributed_db.repository.ProfesseurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfesseurService {
    @Autowired
    private ProfesseurRepository professeurRepository;

    public List<Professeur> getAllProfesseur(){
        return this.professeurRepository.findAll();
    }

    public int updateProfesseurs(){
        return this.professeurRepository.updateProfesseur();
    }



}
