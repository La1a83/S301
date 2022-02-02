/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nivell3_Exercici1;

import java.util.ArrayList;
import java.util.List;


public class Parking {
    
    List <Vehicle> vehicles = new ArrayList<>();

    public void afegirVehicle( Vehicle vehicle) {
        this.vehicles.add(vehicle);
    }
    
    
    public List<Vehicle> getVehicles() {
        return vehicles;
    }
    
    
    
    
}


