package com.humanbooster.examHibernate.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    @NotBlank(message = "Veuillez saisir un pseudo")
    @NotNull(message = "Veuillez saisir un pseudo")
    private String username;

    @Column(nullable = false)
    @NotBlank(message = "Veuillez saisir un role")
    @NotNull(message = "Veuillez saisir un role")
    @Type(type = "text")
    private String roles;

    @Column(nullable = false)
    @NotBlank(message = "Veuillez saisir un mot de passe")
    @NotNull(message = "Veuillez saisir un mot de passe")
    private String password;

    @Column(nullable = false)
    @NotBlank(message = "Veuillez saisir un mail")
    @NotNull(message = "Veuillez saisir un mail")
    private String email;

    @Column(nullable = false)
    @NotBlank(message = "Veuillez saisir un nom")
    @NotNull(message = "Veuillez saisir un nom")
    private String nom;

    @Column(nullable = false)
    @NotBlank(message = "Veuillez saisir un prenom")
    @NotNull(message = "Veuillez saisir un prenom")
    private String prenom;

    @Column(nullable = false)
    @NotBlank(message = "Veuillez saisir un numéro de téléphone")
    @NotNull(message = "Veuillez saisir un numéro de téléphone")
    private String num_telephone;

    //********************
    // Constructeur vide
    //********************

    public User() {
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNum_telephone() {
        return num_telephone;
    }

    public void setNum_telephone(String num_telephone) {
        this.num_telephone = num_telephone;
    }


}
