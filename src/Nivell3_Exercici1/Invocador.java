
package Nivell3_Exercici1;

import java.util.List;
import java.util.ArrayList;

public class Invocador {
    
    private List<Order> orderList = new ArrayList<>();
    
    public void addOrders(Order order) {
        orderList.add(order);
    }
    
    
    public void executeOrders() {
        this.orderList.forEach(x -> x.execute());
        
    }
    
    
    
}
