import java.util.ArrayList;

/**
 * Represents the Fruit Public Class
 */

public class Fruit {

    /**
     * Set the native variables of the fruit class
     */
    public String name;
    private float averageWeight;
    public ArrayList<String> colors = new ArrayList<>();

    /**
     * Object constructor to assign name and averageWeight
     */
    public Fruit(String name, float averageWeight){
        this.name = name;
        this.averageWeight = averageWeight;
    }

    /**
     * Method for set add color to array
     */
    public ArrayList<String> setColor(String nameColor) {
        this.colors.add(nameColor);
        return this.colors;
    }

    /**
     * Method to print array of colors in console
     */
    public void getColors() {
        System.out.print("This " + name + " has ");
        System.out.println(this.colors + " colors.");
    }

    /**
     * Method to get weight
     */
    public float getWeight() {
        return averageWeight;
    }

}
