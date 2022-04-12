/**
 * Represents the main public class
 * @autor Rene Abadia
 */

public class Main {

    public static void main(String[] args){

        /**
         * Creates the person instance of type person class
         */
        Person person = new Person();
        /**
         * Set the first name and the last name of the person method
         */
        person.setName("Aquiles");
        person.setLastName("Esquivel", "Madrazo");
        /**
         * Prints the entered data to the console
         */
        System.out.print("\nName: " + person.getName() + " "); System.out.println(person.getLastName());
        /**
         * Set the birthday of the person method
         */
        person.setDateBirth(1989, 1, 15);

        /**
         * Creates the fruit instance of type Fruit class
         */
        Fruit fruit = new Fruit("apple", 5);
        /**
         * Set data in the fruit method
         */
        fruit.setColor("red");
        fruit.setColor("green");
        fruit.setColor("blue");
        fruit.getColors();

        /**
         * Creates meat instance of meat class and obtains a boolean return
         */
        Meat meat = new Meat(15);
        /**
         * An "if" conditional is created to select a discount and the result is printed to the console
         */
        boolean cond = meat.hasDiscount();
        if(cond) {System.out.println("This meat has a discount.");}
        else {System.out.println("This meat has not a discount.");}

        // Create object bank account and use its methods
        /**
         * Creates bank account instance of Bank account class and use it methods
         */
        bankAccount account = new bankAccount(4321, 100);
        /**
         * Set Bank account assign setActivated as true
         */
        account.setActivated(true);
        account.getActivated();

        /**
         * Creates the Customer instance using class Person
         */
        Customer customer = new Customer(person);
        /**
         * Set the customer setTypeCustomer in the variable
         */
        customer.setTypeCustomer("gold");
        customer.getTypeCustomer();

        // Create object balance to measure accumulated weights
        /**
         * Creates balance instance to measure accumulated weights
         */
        Fruit apple = new Fruit("apple",4);
        Meat beef_cut = new Meat(6);
        Balance balance = new Balance(apple, beef_cut);
        balance.getWeights();

    }

}
