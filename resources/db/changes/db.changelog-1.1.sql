CREATE TABLE angajati (
    idAngajat LONG PRIMARY KEY AUTO_INCREMENT,
    prenume VARCHAR(50) NOT NULL,
    nume VARCHAR(50) NOT NULL,
    functie VARCHAR(50) NOT NULL,
    salariu DOUBLE NOT NULL,
    data_angajare DATE NOT NULL
);