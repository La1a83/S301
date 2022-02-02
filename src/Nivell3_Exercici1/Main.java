
package Nivell3_Exercici1;

/**
 *
 * @author Laia Facundo
 */
public class Main {

   
    public static void main(String[] args) {
       
        //Es crea el Parking:
        Parking parking = new Parking();
        
        
        //Es creem vehicles:
        Vehicle cotxe = new Vehicle("cotxe");
        Vehicle moto = new Vehicle("moto");
        Vehicle avio = new Vehicle("avio");
        Vehicle vaixell = new Vehicle("vaixell");
        
        //S'afegeixen al parking:
        parking.afegirVehicle(cotxe);
        parking.afegirVehicle(moto);
        parking.afegirVehicle(vaixell);
        parking.afegirVehicle(avio);
        
        //Es creen objectes de les classes d'implementació amb les ordres:
        ArrencarVehicles arrencarVehicles = new ArrencarVehicles(parking);
        AccelerarVehicles accelerarVehicles = new AccelerarVehicles(parking);
        FrenarVehicles frenarVehicles = new FrenarVehicles(parking);
        
        //Es crea invocador
        Invocador inv = new Invocador();
        //S'afegeixen les ordres al llistat de l'invocador:
        inv.addOrders(arrencarVehicles);
        inv.addOrders(accelerarVehicles);
        inv.addOrders(frenarVehicles);
        
        //Crida al mètode executar Ordres del invocador:
        inv.executeOrders();
        
        
        
        
    }
    
}
