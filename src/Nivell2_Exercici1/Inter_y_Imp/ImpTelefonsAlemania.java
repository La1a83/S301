/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nivell2_Exercici1.Inter_y_Imp;

import Nivell2_Exercici1.Inter_y_Imp.Telefon;

/**
 *
 * @author Laia Facundo
 */
public class ImpTelefonsAlemania implements Telefon {

    @Override
    public String getTelefon(String telefon) {
        
        String prefix = "+49";
        return prefix+telefon;
        
    }
   

    
    
}
