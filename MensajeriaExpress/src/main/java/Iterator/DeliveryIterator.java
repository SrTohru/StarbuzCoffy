/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Iterator;

import Dominio.Delivery;
import Interfaces.iIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author HP 240 G8
 */
public class DeliveryIterator implements iIterator{

    List<Double> collection;
    private int index;
    
    public DeliveryIterator(Delivery delivery){
        collection= new ArrayList<>();
        collection.add(delivery.getPackageType().getAditionalCost());
        collection.add(delivery.getTransport().getCost());
        collection.add(delivery.getService().getCost());
        index=0;
        
    }

    @Override
    public double getNext() {

        double d = collection.get(index);
        index++;
        return d;

    }

    @Override
    public boolean hasNext() {
        return collection.size()>index;
    }
    
    
}
