
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package Interfaces;

import Dominio.Delivery;
import Dominio.Packages;
import Dominio.Service;
import Dominio.Transport;

/**
 *
 * @author HP 240 G8
 */
public interface iDeliveryBuilder {
 
    public void buildService(Service service);
    public void buildTransport(Transport transport);
    public void buildPackage(Packages packageType);
    public void addCost(double cost);
    public Delivery getProduct();
    public void buildDistance (double distance);
    public void buildArrivalTime(double arrivalTime);
    public void reset();
    
}