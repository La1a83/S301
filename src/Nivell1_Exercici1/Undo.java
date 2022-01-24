
package Nivell1_Exercici1;

import java.util.ArrayList;

/**
 *
 * @author Laia Facundo
 */
public class Undo {
    //Creació atributs 
    private static Undo instance;
    private  ArrayList<String> comandos;
    
    //Constructor private per evitar mútiples instàncies d'objectes Undo.
    private Undo() {
        this.comandos = new ArrayList ();
    
    }
    
    //Mètode per instanciar objecte Undo, en cas que no estigui instanciat abans:
    public static Undo getInstance() {
		if (instance == null) {
			instance = new Undo();
		}
		return instance;
    }
    
    //Mètode per mostrar el contingut:
    public void mostrar() {
        System.out.println(this.comandos);
    }
    //Mètode per afegir comandos:
    public void afegeixComando(String comando) {
        this.comandos.add(comando);
    }
    
    public void eliminaComando(String comando) {
        this.comandos.remove(comando);
    }
    
}
