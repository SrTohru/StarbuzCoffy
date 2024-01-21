/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

/**
 *
 * @author HP 240 G8
 */
public class SoyDecorator extends BeverageDecorator {

    public SoyDecorator(Beverage wrapper,int amount) {
        super(wrapper,amount,1.5f);
        addSoy();
    }


    private void setDescription() {
        this.description = amount+" cups of soy";
    }

    private void setCost() {
        this.cost =costPerAmount*amount;
    }
    
    public void addSoy(){
        setDescription();
        setCost();
    }
}
