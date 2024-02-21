/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

import Dominio.Motorcycle;
import Dominio.Transport;
import Interfaces.iTransportFactory;

/**
 *
 * @author HP 240 G8
 */
public class MotorcycleCreator implements iTransportFactory{

    @Override
    public Transport createTransport() {
        return new Motorcycle();
    }
    
}
