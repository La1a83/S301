/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nivell2_Exercici1;

import Nivell2_Exercici1.Inter_y_Imp.Telefon;
import Nivell2_Exercici1.AbstractFactory.FactoryProducer;
import Nivell2_Exercici1.AbstractFactory.AbstractFactory;
import Nivell2_Exercici1.Agenda.Agenda;
import Nivell2_Exercici1.Inter_y_Imp.Adresa;

/**
 *
 * @author Laia Facundo
 */
public class Main {

    
    public static void main(String[] args) {
        
        //Creació Agenda:
        Agenda agenda = new Agenda();
        
        
        //Es crea la fàbrica d'Adreces:
        AbstractFactory fabricaAdreces = FactoryProducer.getFactory("adreces");
        
        //Es crea la fàbrica de telèfons:
        AbstractFactory fabricaTelefons = FactoryProducer.getFactory("telefons");
        
        //Es crea objecte adreça Espanya:
        Adresa adresa1 = fabricaAdreces.Adresa("Espanya");
        String adre= adresa1.Adresa("provant");
        
        //Es crea objecte telèfon Espanya:
        Telefon telefon1 = fabricaTelefons.Telefon("Espanya");
        String tel = telefon1.getTelefon("657837382");
        
        //S'afegeixen a l'agenda:
        agenda.afegeixAdreçaiTelefon("Manuela",adre,tel,"Espanya");
       
        
        //Es repeteix la mateixa operació amb exemples de França i Alemania:
        //França:
        Adresa adresa2= fabricaAdreces.Adresa("França");
        String adre2 = adresa2.Adresa("Rue du Pont");
        Telefon telefon2 = fabricaTelefons.Telefon("França");
        String tel2 = telefon2.getTelefon("657839303");
        agenda.afegeixAdreçaiTelefon("François", adre2, tel2, "França");
        
        Adresa adresa3 = fabricaAdreces.Adresa("Alemania");
        String adre3 = adresa3.Adresa("adreça inventada");
        Telefon telefon3 = fabricaTelefons.Telefon("Alemania");
        String tel3 = telefon3.getTelefon("628124703");
        agenda.afegeixAdreçaiTelefon("Klaus", adre3, tel3, "Alemania");
        
        //Impresió de l'Agenda:
        agenda.mostraAgenda();
        
    }
    
}
