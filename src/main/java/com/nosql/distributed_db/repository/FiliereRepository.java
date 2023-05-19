package com.nosql.distributed_db.repository;

import com.nosql.distributed_db.domain.Filiere;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface FiliereRepository extends JpaRepository<Filiere,String> {
    @Query(value="insert into Filiere select * from Filiere_view v where v.ID not in (select ID from Filiere)",nativeQuery = true)
    int updateFiliere();
}
