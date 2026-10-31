package com.teoriejava.site_teorie.model;

import jakarta.persistence.*; //importa specificatiile jpa persistence API (@Entity @Id)

@Entity
@Table(name = "lectii")
public class Lectie {

    @Id   // marcheaza cimpul id ca fiind cheie primara
    @GeneratedValue(strategy = GenerationType.IDENTITY)   //increment automat id 1,2,3,...
    private Long id;

    private String titlu;

    private String categorie; // ex: "Metode", "Clase", "Excepții"

    @Column(length = 2000) // Îi dăm o lungime mai mare textului pentru explicații lungi
    private String continut;

    @Column(length = 2000)
    private String cod;

    @Column(length = 4000)
    private String explicatie;
    private String nume_fisierZip;

    // Constructori
    public Lectie() {
    }

    public Lectie(String titlu, String categorie, String continut) {
        this.titlu = titlu;
        this.categorie = categorie;
        this.continut = continut;
    }
    public Lectie(String titlu, String categorie, String continut, String nume_fisierZip) {
        this.titlu = titlu;
        this.categorie = categorie;
        this.continut = continut;
        this.nume_fisierZip=nume_fisierZip;
    }

    public Lectie(String titlu, String categorie, String continut, String cod, String explicatie) {
        this.titlu = titlu;
        this.categorie = categorie;
        this.continut = continut;
        this.cod = cod;
        this.explicatie = explicatie;
    }

    // Getteri și Setteri
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getContinut() {
        return continut;
    }

    public void setContinut(String continut) {
        this.continut = continut;
    }

    public String getCod() {
        return cod;
    }

    public String getExplicatie() {
        return explicatie;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public void setExplicatie(String explicatie) {
        this.explicatie = explicatie;
    }

    public String getNume_fisierZip() {
        return nume_fisierZip;
    }

    public void setNume_fisierZip(String nume_fisierZip) {
        this.nume_fisierZip = nume_fisierZip;
    }
}