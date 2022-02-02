/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nivell2_Exercici1.AbstractFactory;

import Nivell2_Exercici1.AbstractFactory.AbstractFactory;
import Nivell2_Exercici1.Inter_y_Imp.Adresa;
import Nivell2_Exercici1.Inter_y_Imp.ImpBuida;
import Nivell2_Exercici1.Inter_y_Imp.ImpTelefonsAlemania;
import Nivell2_Exercici1.Inter_y_Imp.ImpTelefonsEspanya;
import Nivell2_Exercici1.Inter_y_Imp.ImpTelefonsFransa;
import Nivell2_Exercici1.Inter_y_Imp.Telefon;

/**
 *
 * @author Laia Facundo
 */
public class FactoryTelefons implements AbstractFactory {

    @Override
    public Adresa Adresa(String pais) {
        return null;
    }

    @Override
    public Telefon Telefon(String pais) {
         if (pais== "Espanya") {
            return new ImpTelefonsEspanya();
        } else if (pais =="França") {
            return new ImpTelefonsFransa();
        } else if (pais == "Alemania") {
            return new ImpTelefonsAlemania();
        } else {
            return new ImpBuida();
        }
        
    }
    
}
