package Main;

import Facades.DeliveryManager;
import java.util.Scanner;

/**
 *
 * @author HP 240 G8
 */
public class Main {

    public static void main(String[] args) {

        DeliveryManager deliveryManager = new DeliveryManager();
        Scanner tec = new Scanner(System.in);
        String packageType, service;
        double distance;

        System.out.println("Select the kind of package: (Envelope, SmallBox, MediumBox, BigBox)");
        packageType = tec.nextLine();
        System.out.println("Select the desired service: (Standar/Express)");
        service = tec.nextLine();
        System.out.println("What's the delivery distance?:");
        distance = tec.nextDouble();

        System.out.println("\n\n" + deliveryManager.createDelivery(service, distance, packageType) + "\n\n");

        System.out.println("Would you like to make another delivery? (True/False)");
        
    }    
    
    public static void test(){
        DeliveryManager deliveryManager = new DeliveryManager();
        
        System.out.println(deliveryManager.createDelivery("Standar", 4, "Small Box"));
        System.out.println();
        System.out.println(deliveryManager.createDelivery("Express", 12, "Medium Box"));
        System.out.println();
    }
}