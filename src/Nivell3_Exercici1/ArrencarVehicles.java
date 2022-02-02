
package Nivell3_Exercici1;

import java.util.List;

/**
 *
 * @author Laia Facundo
 */
public class ArrencarVehicles implements Order {
    
    private Parking parking;
    
    public ArrencarVehicles(Parking parking) {
        this.parking = parking;
    }

   
    @Override
    public void execute() {
        List<Vehicle> list = parking.getVehicles();
        list.forEach(x -> x.arrencar());
    }
    
    
}
