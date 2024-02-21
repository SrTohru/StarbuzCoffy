/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder;

import Dominio.Delivery;
import Dominio.Packages;
import Dominio.Service;
import Dominio.Transport;
import Interfaces.iDeliveryBuilder;

/**
 *
 * @author HP 240 G8
 */

public class DeliveryBuilder implements iDeliveryBuilder {

    private Delivery product;

    @Override
    public void buildService(Service service) {
        product.setService(service);
    }

    @Override
    public void buildTransport(Transport transport) {
        product.setTransport(transport);
    }

    @Override
    public void buildPackage(Packages packageType) {
        product.setPackageType(packageType);
    }

    @Override
    public Delivery getProduct() {
        return product;
    }

    @Override
    public void reset() {
        this.product= new Delivery();
    }

    @Override
    public void addCost(double cost) {
        product.setFinalCost(product.getFinalCost()+cost);
    }

    @Override
    public void buildDistance(double distance) {
        product.setDistance(distance);
    }

    @Override
    public void buildArrivalTime(double arrivalTime) {
        product.setArrivalTime(arrivalTime);
    }
    
    
}