


/**
 *
 * @author Laia Facundo
 */

package Nivell1_Exercici1;
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    
    static Scanner sc = new Scanner(System.in);
    static boolean fi = false;
    static Undo singleton = Undo.getInstance();
    public static void main(String[] args) {
        
        Main programa = new Main();
        programa.inici();
        
    }
    
    public void inici() {
        //Instanciamemt de l'objecte singleton de la classe Undo:
        
        //Crida a mètode mostrarMenu:
        while(!fi){
            mostraMenu();
            gestionaOpcio();
        }
    }
    
    //Mètode que mostra les opcions del menú:
    public void mostraMenu() {
        
        System.out.println("\nMENÚ OPCIONS\n");
        System.out.println("1.Afegir Comando.\n2.Eliminar comando."
                                     + "\n3.Mostrar comandos.\n4.Sortir");
         System.out.println("Tria una opció.");
        
    }
    public void gestionaOpcio() {
       
        int opcio = sc.nextInt();
        sc.nextLine();
        
        switch (opcio) {
            case 1:
                singleton.afegeixComando(afegir());
                break;
            case 2:
                singleton.eliminaComando(eliminar());
                break;
            case 3:
                singleton.mostrar();
                break;
            case 4:
                System.out.println("Adéu!");
                fi = true;
        }
    }
    
    public String afegir() {
        
        System.out.println("introdueix el comando que vols afegir i desprès pitja"
                + " la tecla retorn: ");
        return sc.nextLine();
        
    }
    
    public String eliminar() {
        String comando2;
        System.out.println("Introdueix el comando que vols eliminar  i desprès "
                + "pitja la tecla retorn: ");
        comando2 = sc.nextLine();
        return comando2;
    }
}
