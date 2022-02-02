/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nivell3_Exercici1;

/**
 *
 * @author Laia Facundo
 */
public class Vehicle {
    
    String nom;
    
    public Vehicle(){};
    
    
    public Vehicle (String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }
    
     
    public void arrencar() {
        System.out.println(this.getNom()+" arrencant...");
    }
    public void accelerar() {
        System.out.println(this.getNom()+" accelerant...");
    }
    public void frenar() {
        System.out.println(this.getNom()+" frenant...");
    }
}
