
package Nivell2_Exercici1.AbstractFactory;

import Nivell2_Exercici1.Inter_y_Imp.Adresa;
import Nivell2_Exercici1.Inter_y_Imp.Telefon;

/**
 *
 * @author Laia Facundo
 */
public interface AbstractFactory {
    
    Adresa Adresa(String pais);
    Telefon Telefon(String pais);
    
    
    
}
