/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facades;

import Dominio.Bicycle;
import Dominio.BigBox;
import Dominio.Car;
import Dominio.Dron;
import Dominio.Envelope;
import Dominio.ExpressService;
import Dominio.MediumBox;
import Dominio.Motorcycle;
import Dominio.Packages;
import Dominio.SmallBox;
import Dominio.StandarService;
import Dominio.Transport;
import Factory.BicycleCreator;
import Factory.BigBoxCreator;
import Factory.CarCreator;
import Factory.DronCreator;
import Factory.EnvelopeCreator;
import Factory.MediumBoxCreator;
import Factory.MotorcycleCreator;
import Factory.SmallBoxCreator;
import Interfaces.iFactoryManager;

/**
 *
 * @author HP 240 G8
 */
public class FactoryManager implements iFactoryManager{
    
    private EnvelopeCreator envelopeCreator;
    private SmallBoxCreator smallBoxCreator;
    private MediumBoxCreator mediumBoxCreator;
    private BigBoxCreator bigBoxCreator;
    private StandarService standarService;
    private ExpressService expressService;
    private DronCreator dronCreator;
    private BicycleCreator bicycleCreator;
    private MotorcycleCreator motorcycleCreator;
    private CarCreator carCreator;

    public FactoryManager() {
        this.envelopeCreator = new EnvelopeCreator();
        this.smallBoxCreator = new SmallBoxCreator();
        this.mediumBoxCreator = new MediumBoxCreator();
        this.bigBoxCreator = new BigBoxCreator();
        this.standarService = new StandarService();
        this.expressService = new ExpressService();
        this.dronCreator = new DronCreator();
        this.bicycleCreator = new BicycleCreator();
        this.motorcycleCreator = new MotorcycleCreator();
        this.carCreator = new CarCreator();
    }

    @Override
    public Packages createEnvelope() {
        return envelopeCreator.createPackage();
    }

    @Override
    public Packages createSmallBox() {
        return smallBoxCreator.createPackage();
    }

    @Override
    public Packages createMediumBox() {
        return mediumBoxCreator.createPackage();
    }

    @Override
    public Packages createBigBox() {
        return bigBoxCreator.createPackage();
    }

    @Override
    public StandarService getStandarService() {
        return standarService;
    }

    @Override
    public ExpressService getExpressService() {
        return expressService;
    }

    @Override
    public Transport createDron() {
        return dronCreator.createTransport();
    }

    @Override
    public Transport createBicycle() {
        return bicycleCreator.createTransport();
    }

    @Override
    public Transport createMotorcycle() {
        return motorcycleCreator.createTransport();
    }

    @Override
    public Transport createCar() {
        return carCreator.createTransport();
    }    
        
}
