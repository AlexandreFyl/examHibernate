package com.humanbooster.examHibernate.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "color")
public class Color {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    @NotBlank(message = "Veuillez saisir un libelle")
    @NotNull(message = "Veuillez saisir un libelle")
    private String libelle;

    //********************
    // Constructeur vide
    //********************

    public Color() {
    }

    //********************
    // Getters / setters
    //********************

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }


}
