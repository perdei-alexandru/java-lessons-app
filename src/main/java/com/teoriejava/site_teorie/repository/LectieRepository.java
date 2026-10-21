package com.teoriejava.site_teorie.repository;
// traduce comenzile din java in sql

import com.teoriejava.site_teorie.model.Lectie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LectieRepository extends JpaRepository<Lectie, Long> {
    // Spring Data JPA generează automat interogarea SQL de filtrere
    List<Lectie> findByCategorieContainingIgnoreCaseOrTitluContainingIgnoreCase(String categorie, String titlu);

    // Căutare după categorie exactă
    List<Lectie> findByCategorie(String categorie);

    // Căutare combinată: titlu (contine text) SI categorie
    List<Lectie> findByTitluContainingIgnoreCaseAndCategorie(String titlu, String categorie);

    // Căutare simplă după titlu
    List<Lectie> findByTitluContainingIgnoreCase(String titlu);
    List<Lectie> findByTitlu(String titlu);
}