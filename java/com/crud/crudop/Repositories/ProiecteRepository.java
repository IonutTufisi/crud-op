package com.crud.crudop.Repositories;

import com.crud.crudop.Entities.Proiecte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProiecteRepository extends JpaRepository<Proiecte, Long> {

    @Query(value = "SELECT * FROM proiecte p, angajati a WHERE p.idul_proiect = a.idul_proiect", nativeQuery = true)
    List<Proiecte> findProiecteWithAngajati();

}
