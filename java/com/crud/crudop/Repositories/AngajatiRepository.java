package com.crud.crudop.Repositories;

import com.crud.crudop.Entities.Angajati;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AngajatiRepository extends JpaRepository<Angajati, Long> {
}
