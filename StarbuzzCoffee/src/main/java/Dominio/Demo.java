package Dominio;

/**
 *
 * @author Erick Labrada
 */
public class Demo {


    public static void main(String[] args) {

        Beverage expresso = new Expresso();
        
        System.out.println("Basic: \n\n"+expresso);

        
        addMilk(expresso,1);
        
        System.out.println("\n\nMilk: \n\n"+expresso);
        
        addChocolate(expresso,2);
        
        System.out.println("\n\nDouble Chocolate & Milk :\n\n"+expresso);

        
        Beverage decaff = new Decaff();
        
        System.out.println("Basic: \n\n"+decaff);

        
        addWhippedCream(decaff,3);
        
        System.out.println("\n\nWhippedCream: \n\n"+decaff);
        
        addChocolate(decaff,1);
        
        System.out.println("\n\nDouble Chocolate & WhippedCream :\n\n"+decaff);
      
    }
    
    public static void addMilk(Beverage beverage, int amount){
        MilkDecorator milkDecorator = new MilkDecorator(beverage, amount);  
        milkDecorator.addMilk();
    }
    
    public static void addChocolate(Beverage beverage, int amount){
        ChocolateDecorator chocolateDecorator = new ChocolateDecorator(beverage, amount);
        chocolateDecorator.addChocolate();
    }
    
    public static void addSoy(Beverage beverage, int amount){
        SoyDecorator soyDecorator = new SoyDecorator(beverage, amount);
        soyDecorator.addSoy();
    }
    
    public static void addWhippedCream(Beverage beverage, int amount){
    
        WhippedCreamDecorator whippedCreamDecorator = new WhippedCreamDecorator(beverage, amount);
        whippedCreamDecorator.addWhippedCream();
    }
    
}