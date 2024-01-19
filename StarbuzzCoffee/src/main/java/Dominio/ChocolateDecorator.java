/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

/**
 *
 * @author Erick Labrada
 */
public class ChocolateDecorator extends BeverageDecorator {

    public ChocolateDecorator(Beverage wrapper,int amount) {
        super(wrapper,amount,2.0f);
    }

    private void setDescription() {
        wrapper.description = wrapper.getDescription() +"\n   "+amount+" portions of chocolate";
    }

    private void setCost() {
        wrapper.cost = wrapper.getCost() + costPerAmount*amount;
    }
    
    public void addChocolate(){
        setDescription();
        setCost();
    }
}
