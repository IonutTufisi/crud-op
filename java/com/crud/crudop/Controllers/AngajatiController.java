package com.crud.crudop.Controllers;

import com.crud.crudop.Entities.Angajati;
import com.crud.crudop.Repositories.AngajatiRepository;
import com.crud.crudop.Services.AngajatiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin("*")
public class AngajatiController {

    @Autowired
    private AngajatiRepository angajatiRepository;
    @Autowired
    private AngajatiService angajatiService;

    @GetMapping("/angajati")
    public ResponseEntity<List<Angajati>> getAllAngajati() {
        List<Angajati> angajati = angajatiRepository.findAll();
        return ResponseEntity.ok(angajati);
    }

    @PostMapping("/post")
    public ResponseEntity<?> createAngajat(@RequestBody Angajati angajati) {
        Angajati createdAngajat = angajatiService.createAngajati(angajati);
        return ResponseEntity.ok("Angajat created successfully");
    }
}
