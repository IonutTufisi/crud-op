package com.crud.crudop.Services;

import com.crud.crudop.Entities.Angajati;
import com.crud.crudop.Entities.Proiecte;
import com.crud.crudop.Repositories.AngajatiRepository;
import com.crud.crudop.Repositories.ProiecteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AngajatiService {

    @Autowired
    private AngajatiRepository angajatiRepository;

    @Autowired
    private ProiecteRepository proiecteRepository;

    public Angajati createAngajati(Angajati angajati) {
        Angajati angajat = new Angajati();
        Proiecte proiect = proiecteRepository.findById(angajati.getProiect().getIdulProiect()).orElse(null);
        angajat.setIdAngajat(angajati.getIdAngajat());
        angajat.setPrenume(angajati.getPrenume());
        angajat.setNume(angajati.getNume());
        angajat.setFunctie(angajati.getFunctie());
        angajat.setSalariu(angajati.getSalariu());
        angajat.setData_angajare(angajati.getData_angajare());
        angajat.setProiect(proiect);
        return angajatiRepository.save(angajat);

    }

    public void deleteCamere(Long id) {
        angajatiRepository.deleteById(id);
        //return ResponseEntity.ok().build();
    }
}
