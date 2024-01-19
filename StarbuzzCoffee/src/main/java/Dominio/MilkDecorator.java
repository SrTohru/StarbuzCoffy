/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

/**
 *
 * @author Erick Labrada
 */
public class MilkDecorator extends BeverageDecorator {

    public MilkDecorator(Beverage wrapper,int amount) {
        super(wrapper,amount,1.0f);
    }


    private void setDescription() {
        wrapper.description = wrapper.getDescription() +"\n   "+amount+" cups of milk";
    }

    private void setCost() {
        wrapper.cost = wrapper.getCost() + costPerAmount*amount;
    }
    
    public void addMilk(){
        setDescription();
        setCost();
    }
}
