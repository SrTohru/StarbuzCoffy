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
        addWhippedCream();
    }


    private void setDescription() {
        this.description = amount+" portions of whippedCream";
    }

    private void setCost() {
        this.cost = costPerAmount*amount;
    }
    
    public void addWhippedCream(){
        setDescription();
        setCost();
    }
}
