/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

/**
 *
 * @author HP 240 G8
 */
public class Delivery {
    
    private Service service;
    private Transport transport;
    private Packages packageType;
    private double distance;
    private double finalCost;
    private double arrivalTime;
    public Delivery(){
        
    }
    
    public Delivery(Service service, Transport transport, Packages packageType, double distance) {
        this.service = service;
        this.transport = transport;
        this.packageType = packageType;
        this.distance = distance;
        finalCost=0;
    }

    public double getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(double arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public Packages getPackageType() {
        return packageType;
    }

    public void setPackageType(Packages packageType) {
        this.packageType = packageType;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getFinalCost() {
        return finalCost;
    }

    public void setFinalCost(double finalCost) {
        this.finalCost = finalCost;
    }

    @Override
    public String toString() {
        return "Delivery{" + "service=" + service + ", transport=" + transport + ", packageType=" + packageType + ", distance=" + distance + ", finalCost=" + finalCost + ", arrivalTime=" + arrivalTime + '}';
    }

  

    
    
    
    
}
