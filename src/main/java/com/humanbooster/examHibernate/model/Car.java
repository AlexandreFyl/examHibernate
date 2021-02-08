package com.humanbooster.examHibernate.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "car")
public class Car {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    @NotBlank(message = "Veuillez saisir une marque")
    @NotNull(message = "Veuillez saisir une marque")
    private String marque;

    @Column(nullable = false)
    @NotBlank(message = "Veuillez saisir un modele")
    @NotNull(message = "Veuillez saisir un modele")
    private String modele;

    @Column(nullable = false)
    @NotBlank(message = "Veuillez saisir un carburant")
    @NotNull(message = "Veuillez saisir un carburant")
    private String carburant;

    @Column(nullable = false)
    @NotBlank(message = "Veuillez saisir une année")
    @NotNull(message = "Veuillez saisir une année")
    private Integer annee;

    @Column(nullable = false)
    @NotBlank(message = "Veuillez saisir un kilometrage")
    @NotNull(message = "Veuillez saisir un kilometrage")
    private Integer kilometrage;

    @Column(nullable = false)
    @NotBlank(message = "Veuillez saisir un prix")
    @NotNull(message = "Veuillez saisir un prix")
    private Integer prix;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    @NotBlank(message = "Veuillez saisir une date")
    @NotNull(message = "Veuillez saisir une date")
    private Date date_ajout;

    @Column(nullable = false)
    @NotBlank(message = "Veuillez saisir une description")
    @NotNull(message = "Veuillez saisir une description")
    @Type(type = "text")
    private String description;



    @ManyToOne(optional = true)
    @JoinColumn(name = "garage_id", referencedColumnName = "id")
    private Garage garage;

    @ManyToMany
    @JoinTable(
            name = "color_car",
            joinColumns = {@JoinColumn(name = "car_id")},
            inverseJoinColumns = {@JoinColumn(name = "color_id")}
    )
    private List<Color> colors;
    //********************
    // Constructeur vide
    //********************

    public Car() {
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


    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getCarburant() {
        return carburant;
    }

    public void setCarburant(String carburant) {
        this.carburant = carburant;
    }

    public Integer getAnnee() {
        return annee;
    }

    public void setAnnee(Integer annee) {
        this.annee = annee;
    }

    public Integer getKilometrage() {
        return kilometrage;
    }

    public void setKilometrage(Integer kilometrage) {
        this.kilometrage = kilometrage;
    }

    public Integer getPrix() {
        return prix;
    }

    public void setPrix(Integer prix) {
        this.prix = prix;
    }

    public Date getDate_ajout() {
        return date_ajout;
    }

    public void setDate_ajout(Date date_ajout) {
        this.date_ajout = date_ajout;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public Garage getGarage() {
        return garage;
    }

    public void setGarage(Garage garage) {
        this.garage = garage;
    }

    public List<Color> getColors() {
        return colors;
    }

    public void setColors(List<Color> colors) {
        this.colors = colors;
    }
}
