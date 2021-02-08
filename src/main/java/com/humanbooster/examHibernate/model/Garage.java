package com.humanbooster.examHibernate.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "garage")
public class Garage implements Serializable {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    @NotBlank(message = "Veuillez saisir un nom")
    @NotNull(message = "Veuillez saisir un nom")
    private String nom;

    @Column(nullable = false)
    @NotBlank(message = "Veuillez saisir une rue")
    @NotNull(message = "Veuillez saisir une rue")
    private String rue;

    @Column(nullable = false)
    @NotBlank(message = "Veuillez saisir un code postal")
    @NotNull(message = "Veuillez saisir un code postal")
    private String code_postal;

    @Column(nullable = false)
    @NotBlank(message = "Veuillez saisir une ville")
    @NotNull(message = "Veuillez saisir une ville")
    private String ville;

    @Column(nullable = false)
    @NotBlank(message = "Veuillez saisir un numero de telephone")
    @NotNull(message = "Veuillez saisir un numero de telephone")
    private String num_telephone;

    @Column(nullable = false)
    @NotBlank(message = "Veuillez saisir un numero de SIRET")
    @NotNull(message = "Veuillez saisir un numero de SIRET")
    private String num_siret;

    @ManyToOne(optional = true)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    //********************
    // Constructeur vide
    //********************

    public Garage() {
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

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getCode_postal() {
        return code_postal;
    }

    public void setCode_postal(String code_postal) {
        this.code_postal = code_postal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getNum_telephone() {
        return num_telephone;
    }

    public void setNum_telephone(String num_telephone) {
        this.num_telephone = num_telephone;
    }

    public String getNum_siret() {
        return num_siret;
    }

    public void setNum_siret(String num_siret) {
        this.num_siret = num_siret;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
