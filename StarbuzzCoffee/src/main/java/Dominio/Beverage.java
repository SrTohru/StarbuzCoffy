package Dominio;

/**
 *
 * @author Erick Labrada
 */

public abstract class Beverage {

    public String description;
    public float cost;
    public boolean isWrapped;


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
        return "\nDescription: "+ description;
    }

}
