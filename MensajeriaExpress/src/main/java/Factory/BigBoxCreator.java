/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

import Dominio.BigBox;
import Dominio.Packages;
import Interfaces.iPackageFactory;

/**
 *
 * @author HP 240 G8
 */
public class BigBoxCreator implements iPackageFactory{

    @Override
    public Packages createPackage() {
        return new BigBox();
    }
    
}
