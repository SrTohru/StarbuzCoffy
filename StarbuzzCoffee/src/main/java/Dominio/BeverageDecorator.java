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
    
    public Beverage wrapper;
    public int amount;
    public float costPerAmount;
    
    public BeverageDecorator(Beverage wrapper, int amount, float costPerAmount) {
        this.wrapper = wrapper;
        this.amount=amount;
        this.costPerAmount=costPerAmount;
        wrapper.isWrapped=true;
        
        unifyDecoratorLayers(amount);
        
    }   
    
    public void unifyDecoratorLayers(int amount){
                    System.out.println(this.amount);

        if (wrapper.getClass().equals(this.getClass())){
            this.amount=this.amount+amount;
        }
                System.out.println(this.amount);

    }
    
    @Override
    public float getCost(){
        return this.cost+wrapper.getCost();
    }
    
    @Override
    public String toString() {
        
        String s=  wrapper+description+", Cost: "+cost+"\n";
        
        if (this.isWrapped){
            return s;
        } else {
            return s+"---------------------------------------\nTotal: "+getCost()+"\n";
        }
    }
    
}