package com.crud.crudop.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Proiecte")
public class Proiecte {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idulProiect")
    private Long idulProiect;

    //@Column(name = "Denumire")
    private String denumire;

    //@Column(name = "Descriere")
    private String descriere;

    //@Column(name = "Cost Lunar")
    private int costLunar;

    @OneToMany(mappedBy = "proiect")
    private List<Angajati> angajati = new ArrayList<>();

    public Proiecte(Long idulProiect, String denumire, String descriere, int costLunar, List<Angajati> angajati) {
        this.idulProiect = idulProiect;
        this.denumire = denumire;
        this.descriere = descriere;
        this.costLunar = costLunar;
        this.angajati = angajati;
    }

    public Proiecte() {
    }

    public Long getIdulProiect() {
        return idulProiect;
    }

    public void setIdulProiect(Long idulProiect) {
        this.idulProiect = idulProiect;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public int getCostLunar() {
        return costLunar;
    }

    public void setCostLunar(int costLunar) {
        this.costLunar = costLunar;
    }

    public List<Angajati> getAngajati() {
        return angajati;
    }

    public void setAngajati(List<Angajati> angajati) {
        this.angajati = angajati;
    }
}
