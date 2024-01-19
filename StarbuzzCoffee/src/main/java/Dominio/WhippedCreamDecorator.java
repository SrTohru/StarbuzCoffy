/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

/**
 *
 * @author Erick Labrada
 */
public class WhippedCreamDecorator extends BeverageDecorator {

    public WhippedCreamDecorator(Beverage wrapper,int amount) {
        super(wrapper,amount,.5f);
    }


    private void setDescription() {
        wrapper.description = wrapper.getDescription() +"\n   "+amount+" portions of whippedCream";
    }

    private void setCost() {
        wrapper.cost = wrapper.getCost() + costPerAmount*amount;
    }
    
    public void addWhippedCream(){
        setDescription();
        setCost();
    }
}
