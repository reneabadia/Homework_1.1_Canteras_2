/**
 * Represents the Meat Public Class
 */

public class Meat {

    /**
     * Set the native variables of the Meat class
     */
    private float weight;

    /**
     * Object constructor to assign weight
     */
    public Meat(float weight){
        this.weight = weight;
    }

    /**
     * Conditional to set Boolean method for verify if meat has a discount
     */
    public boolean hasDiscount(){
        if(weight>12)
            return true;
        else
            return false;
    }

    /**
     * Method to get and return weight
     */
    public float getWeight() {
        return weight;
    }
}
