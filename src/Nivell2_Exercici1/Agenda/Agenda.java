
package Nivell2_Exercici1.Agenda;

import Nivell2_Exercici1.Inter_y_Imp.Adresa;
import Nivell2_Exercici1.Inter_y_Imp.Telefon;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Laia Facundo
 */
public class Agenda {
    
    List<Anotacio> llistat = new ArrayList();
    
    
    public void afegeixAdreçaiTelefon(String nom,String adresa, String telefon,
                                                                 String pais) {
        Anotacio anotacio = new Anotacio(nom,adresa,telefon,pais);
        this.llistat.add(anotacio);
                                               
     
    }

    @Override
    public String toString() {
        return "Agenda{" + "llistat=" + llistat + '}';
    }
    
    public void mostraAgenda(){
        for (Anotacio a : llistat) {
            System.out.println("Nom: "+a.getNom()+"| Adreça: "+a.getAdresa()+ 
                    "| Telèfon: "+a.getTelefon()+ "| País: "+a.getPais());
        }
    }
    
    
}
