package Dominio;

/**
 *
 * @author Erick Labrada
 */
public class Demo {


    public static void main(String[] args) {

        test();
      
    }
    
    public static void test(){
        
        Beverage expresso = new Expresso();
        
        MilkDecorator milkDecorator = new MilkDecorator(expresso, 1); 
        
        SoyDecorator soyDecorator = new SoyDecorator(milkDecorator,1);
        
        ChocolateDecorator chocolateDecorator = new ChocolateDecorator(soyDecorator, 2);
        
        System.out.println(chocolateDecorator);
        

        
    }

    
}