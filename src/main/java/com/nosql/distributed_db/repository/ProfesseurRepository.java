package com.nosql.distributed_db.repository;

import com.nosql.distributed_db.domain.Professeur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfesseurRepository extends JpaRepository<Professeur,Integer> {
    @Query(value="insert into Professeur select * from Professeur_view v where v.Code not in (select Code from Professeur)",nativeQuery = true)
    int updateProfesseur();
}
