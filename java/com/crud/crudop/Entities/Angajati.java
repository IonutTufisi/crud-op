package com.crud.crudop.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="Angajati")
public class Angajati {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //@Column(name = "ID")
    private Long idAngajat;

    //@Column(name = "Prenume")
    private String prenume;

    //@Column(name = "Nume")
    private String nume;

   // @Column(name = "Functie")
    private String functie;

    private double salariu;

   // @Column(name = "Data Angajarii")
    private Date data_angajare;

   // @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JsonIgnoreProperties(value = {"idProiect", "denumire", "descriere", "costLunar", "angajati", "id"})
    @JoinColumn(name = "idulProiect")
    private Proiecte proiect;

    public Long getIdAngajat() {
        return idAngajat;
    }

    public double getSalariu() {
        return salariu;
    }

    public void setSalariu(double salariu) {
        this.salariu = salariu;
    }

    public void setIdAngajat(Long idAngajat) {
        this.idAngajat = idAngajat;
    }

    public String getFunctie() {
        return functie;
    }

    public void setFunctie(String functie) {
        this.functie = functie;
    }

    public Date getData_angajare() {
        return data_angajare;
    }

    public void setData_angajare(Date data_angajare) {
        this.data_angajare = data_angajare;
    }

    public Proiecte getProiect() {
        return proiect;
    }

    public void setProiect(Proiecte proiect) {
        this.proiect = proiect;
    }

    public Long getId() {
        return idAngajat;
    }

    public void setId(Long id) {
        this.idAngajat = id;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Angajati(Long idAngajat, String prenume, String nume, String functie, Date data_angajare, Proiecte proiect) {
        this.idAngajat = idAngajat;
        this.prenume = prenume;
        this.nume = nume;
        this.functie = functie;
        this.data_angajare = data_angajare;
        this.proiect = proiect;
    }

    public Angajati() {
    }
}
