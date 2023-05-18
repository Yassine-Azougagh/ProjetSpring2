package com.nosql.distributed_db.service;

import com.nosql.distributed_db.domain.Filiere;
import com.nosql.distributed_db.repository.FiliereRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FiliereService {
    @Autowired
    private FiliereRepository filiereRepository;

    public List<Filiere> getAllFiliere(){
        return this.filiereRepository.findAll();
    }

    public int updateFilieres(){
        return this.filiereRepository.updateFiliere() ;
    }


}
