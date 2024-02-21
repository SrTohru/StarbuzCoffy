/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

/**
 *
 * @author HP 240 G8
 */
public abstract class Packages {
    
    private double cost;

    public Packages(double cost) {
        this.cost = cost;
    }

    public double getAditionalCost() {
        return cost;
    }

    public void setAditionalCost(double aditionalCost) {
        this.cost = cost;
    }
    
    
    
}
