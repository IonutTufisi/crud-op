package com.crud.crudop.Controllers;

import com.crud.crudop.Entities.Proiecte;
import com.crud.crudop.Repositories.ProiecteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin("*")
public class ProiecteController {

    @Autowired
    private ProiecteRepository proiecteRepository;

    @GetMapping("/proiecte")
    public ResponseEntity<List<Proiecte>> getBirouWithCamera() {
        List<Proiecte> proiect = proiecteRepository.findProiecteWithAngajati();
        if (proiect == null) {
            return ResponseEntity.notFound().build();
            // return null;
        }
        return ResponseEntity.ok(proiect);
    }
}
