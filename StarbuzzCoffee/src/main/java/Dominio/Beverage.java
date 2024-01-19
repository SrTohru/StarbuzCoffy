package Dominio;

/**
 *
 * @author Erick Labrada
 */

//Can be either an abstract class or an interface, in this case
//I need to "instance" a beverage so I'll have to go w interface
public abstract class Beverage {

    public String description;
    public float cost;

    public String getDescription() {
        return description;
    }

    public float getCost() {
        return cost;
    }

    public void setDescription(String description) {
        this.description=description;
    }

    public void setCost(float cost) {
        this.cost=cost;
    }

    @Override
    public String toString() {
        return "Beverage name: " + description + "\ncost:" + cost +"$";
    }

}
