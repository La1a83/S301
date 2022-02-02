/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nivell2_Exercici1.Agenda;

/**
 *
 * @author Laia Facundo
 */
public class Anotacio {
    String nom;
    String adresa;
    String telefon;
    String pais;
    
    
    public Anotacio(String nom,String adresa,String telefon, String pais) {
        this.nom = nom;
        this.adresa = adresa;
        this.telefon = telefon;
        this.pais = pais;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
    
    
}
