/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Dominio.Delivery;
import Dominio.Transport;

/**
 *
 * @author HP 240 G8
 */
public interface iDeliveryManager {
    
    public Delivery createDelivery(String service, double distance, String packageType);
    public double getDistanceFee(double distance);
    public void setService(String service);
    public void setTransport(String service, double distance, String packageType);
    public void setPackage(String packageType);
    public void setDistance(double distance);
    public double getCost(Delivery delivery);
    public double getArrivalTime(double distance, Transport transport);
}
