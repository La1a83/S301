/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nivell2_Exercici1.AbstractFactory;

import Nivell2_Exercici1.AbstractFactory.AbstractFactory;
import Nivell2_Exercici1.Inter_y_Imp.Adresa;
import Nivell2_Exercici1.Inter_y_Imp.ImpAdrecesAlemania;
import Nivell2_Exercici1.Inter_y_Imp.ImpAdrecesEspanya;
import Nivell2_Exercici1.Inter_y_Imp.ImpAdrecesFrança;
import Nivell2_Exercici1.Inter_y_Imp.ImpBuida;
import Nivell2_Exercici1.Inter_y_Imp.Telefon;

/**
 *
 * @author Laia Facundo
 */
public class FactoryAdreces implements AbstractFactory{

    @Override
    public Adresa Adresa(String pais) {
        if (pais== "Espanya") {
            return new ImpAdrecesEspanya();
        } else if (pais =="França") {
            return new ImpAdrecesFrança();
        } else if (pais == "Alemania") {
            return new ImpAdrecesAlemania();
        } else {
            return new ImpBuida();
        }
        
    }

    @Override
    public Telefon Telefon(String pais) {
        return null;
    }
    
}
