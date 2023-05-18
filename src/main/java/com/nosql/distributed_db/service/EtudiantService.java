package com.nosql.distributed_db.service;

import com.nosql.distributed_db.domain.Etudiant;
import com.nosql.distributed_db.repository.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EtudiantService {
    @Autowired
    private EtudiantRepository etudiantRepository;

    public List<Etudiant> getAllEtudiant(){
        return this.etudiantRepository.findAll();
    }

    public int updateEtudiants(){
        return this.etudiantRepository.updateEtudiant();

    }


}
