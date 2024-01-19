/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

/**
 *
 * @author Erick Labrada
 */
public class BeverageDecorator extends Beverage{
    
    Beverage wrapper;
    int amount;
    float costPerAmount;

    public BeverageDecorator(Beverage wrapper, int amount, float costPerAmount) {
        this.wrapper = wrapper;
        this.amount = amount;
        this.costPerAmount = costPerAmount;
    }
    
}
