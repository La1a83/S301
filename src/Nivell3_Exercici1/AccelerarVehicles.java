
package Nivell3_Exercici1;

import java.util.List;


public class AccelerarVehicles implements Order {
    
    private Parking parking;
    
    public AccelerarVehicles(Parking parking) {
        this.parking = parking;
    }

   
    @Override
    public void execute() {
        List<Vehicle> list = parking.getVehicles();
        list.forEach(x -> x.accelerar());
    }
    
    
}
