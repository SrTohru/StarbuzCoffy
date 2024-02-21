/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

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
import Facades.FactoryManager;

/**
 *
 * @author HP 240 G8
 */
public interface iFactoryManager {
    
    public Packages createEnvelope();
    public Packages createSmallBox();
    public Packages createMediumBox();
    public Packages createBigBox();
    public StandarService getStandarService();
    public ExpressService getExpressService();
    public Transport createDron();
    public Transport createBicycle();
    public Transport createMotorcycle();
    public Transport createCar();
    
}
