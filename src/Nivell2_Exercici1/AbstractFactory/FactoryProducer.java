
package Nivell2_Exercici1.AbstractFactory;

;

/**
 *
 * @author Laia Facundo
 */
public class FactoryProducer {
    
    //Metode que retorna un tipus de fàbrica (Adreça o Telèfon).
    public static AbstractFactory getFactory(String tipusFabrica) {
        if (tipusFabrica.equalsIgnoreCase("adreces")) {
            return new FactoryAdreces();
        } else if (tipusFabrica.equalsIgnoreCase("telefons")) {
            return new FactoryTelefons();
        }
        return null;
    }
    
    
}
