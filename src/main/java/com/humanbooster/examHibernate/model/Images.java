package com.humanbooster.examHibernate.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "images")
public class Images {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    @NotBlank(message = "Veuillez saisir un nom")
    @NotNull(message = "Veuillez saisir un nom")
    private String nom;

    @ManyToOne(optional = true)
    @JoinColumn(name = "car_id", referencedColumnName = "id")
    private Car car;


    //********************
    // Constructeur vide
    //********************

    public Images() {
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

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
