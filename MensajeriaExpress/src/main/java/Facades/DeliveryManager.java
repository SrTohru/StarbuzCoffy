/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facades;

import Builder.DeliveryBuilder;
import Dominio.Delivery;
import Dominio.Transport;
import Interfaces.iDeliveryManager;
import Iterator.DeliveryIterator;

/**
 *
 * @author HP 240 G8
 */
public class DeliveryManager implements iDeliveryManager{
    
    private FactoryManager factoryManager;
    private DeliveryBuilder deliveryBuilder;

    
    public DeliveryManager() {
        this.factoryManager = new FactoryManager();
        this.deliveryBuilder = new DeliveryBuilder();    
    }



    @Override
    public Delivery createDelivery(String service, double distance, String packageType) {


      deliveryBuilder.reset();
      setService(service);
      setTransport(service, distance, packageType);
      setPackage(packageType);
      setDistance(distance);
      deliveryBuilder.buildArrivalTime(getArrivalTime(distance, deliveryBuilder.getProduct().getTransport()));
      deliveryBuilder.addCost(getDistanceFee(distance));
      deliveryBuilder.addCost(getCost(deliveryBuilder.getProduct()));
      
      return deliveryBuilder.getProduct();
      
    }

    @Override
    public void setService(String service) {
        if (service.equalsIgnoreCase("Express")){
          deliveryBuilder.buildService(factoryManager.getExpressService());
      } else {
          deliveryBuilder.buildService(factoryManager.getStandarService());
        }
    }

    @Override
    public void setTransport(String service, double distance, String packageType) {

        //Decides between drone & Bicycle in case distance is less than 1km
        if (distance<=1){
            if(service.equalsIgnoreCase("Express")){
                deliveryBuilder.buildTransport(factoryManager.createDron());
            } else {
                deliveryBuilder.buildTransport(factoryManager.createBicycle());
            }
        //Decides between Motorcycle & Bicycle in case the distance is over 1km
        } else {
             if(service.equalsIgnoreCase("Express")){
                deliveryBuilder.buildTransport(factoryManager.createMotorcycle());
             } else {
                deliveryBuilder.buildTransport(factoryManager.createBicycle());
             }
        }
        
    }

    @Override
    public void setPackage(String packageType) {
        if (packageType.equalsIgnoreCase("Big Box")) {
            deliveryBuilder.buildPackage(factoryManager.createBigBox());
        } else {
            if (packageType.equalsIgnoreCase("Envelope")) {
                deliveryBuilder.buildPackage(factoryManager.createEnvelope());
            } else {
                if (packageType.equalsIgnoreCase("Small Box")) {
                    deliveryBuilder.buildPackage(factoryManager.createSmallBox());
                } else {
                    deliveryBuilder.buildPackage(factoryManager.createMediumBox());
                }
            }
        }
    }

    @Override
    public double getDistanceFee(double distance) {
        if (distance>10){
            return (distance-10)*5;
        }
        return 0;
    }

    @Override
    public double getCost(Delivery delivery) {

        DeliveryIterator iterator = new DeliveryIterator(delivery);
        double cost = 0;

        
        while(iterator.hasNext()){
            cost = cost + iterator.getNext();;
        }
        return cost;
    }

    @Override
    public void setDistance(double distance) {
        deliveryBuilder.buildDistance(distance);
    }

    @Override
    public double getArrivalTime(double distance, Transport transport) {

        return distance*60/transport.getAverageSpeed();
        
    }
}