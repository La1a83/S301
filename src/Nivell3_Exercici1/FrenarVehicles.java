
package Nivell3_Exercici1;

import java.util.List;


public class FrenarVehicles implements Order {
    private Parking parking;
    
    public FrenarVehicles(Parking parking) {
        this.parking = parking;
    }

   
    @Override
    public void execute() {
        List<Vehicle> list = parking.getVehicles();
        list.forEach(x -> x.frenar());
    }
    
}
