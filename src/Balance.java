/**
 * Represents the Balance Public Class
 */

public class Balance {

    /**
     * Set the native variables of the Balance class
     */
    public Fruit fruit;
    public Meat meat;
    public float weightMeat, weightFruit, totalWeight;

    /**
     * Creates Object constructor using class 'Person' and this name
     * Get weights of class 'Fruit' and 'Meat' and initialize balance measurement in zero
     */
    public Balance(Fruit newFruit, Meat newMeat){
        this.fruit = newFruit;
        this.meat = newMeat;
        this.weightMeat = meat.getWeight();
        this.weightFruit = fruit.getWeight();
        this.totalWeight = 0;
    }

    /**
     *  Method to accumulate total weight of fruits and meets
     */
    public void getWeights(){
        totalWeight = totalWeight + weightFruit + weightMeat;
        System.out.println("The total weight in balance is: "+ totalWeight);
    }


}
