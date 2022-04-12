/**
 * Represents the Customer Public Class
 */

public class Customer {

    /**
     * Set the native variables of the customer class
     */
    public Person client;
    public String name;
    private String TypeCustomer;

    /**
     * Creates object constructor using class 'Person' and this name
     */
    public Customer(Person client){
        this.client = client;
        this.name = client.getName();
    }

    /**
     * Set type of customer
     */
    public void setTypeCustomer(String TypeCustomer) {
        this.TypeCustomer = TypeCustomer;
    }

    /**
     * Get name of class 'Person' and print type of customer
     */
    public void getTypeCustomer() {
        System.out.print(name + " is a client of type: ");
        System.out.println(TypeCustomer);
    }


}
