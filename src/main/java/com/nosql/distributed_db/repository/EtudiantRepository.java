package com.nosql.distributed_db.repository;

import com.nosql.distributed_db.domain.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant,String> {
    @Query(value="insert into Etudiant select * from Etudiant_view v where v.CNE not in (select CNE from Etudiant)",nativeQuery = true)
    int updateEtudiant();
}
