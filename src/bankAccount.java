/**
 * Represents the Bank Account Public Class
 */

public class bankAccount {

    /**
     * Set the native variables of the bankAccount class
     */
    private int accountNumber;
    protected boolean activated;
    public float balance;

    /**
     * Creates Object constructor for bank account, by default account is disabled
     */
    public bankAccount(int accountNumber, float balance){
        this.accountNumber = accountNumber;
        this.activated = false;
        this.balance = balance;
    }

    /**
     *  Method to activate account
     */
    public void setActivated(boolean activated){
        this.activated = activated;
    }

    /**
     * Conditional to print activate account
     */
    public void getActivated(){
        if(this.activated)
            System.out.println("This bank account is Active");
        else
            System.out.println("This bank account is Inactive");
    }


}
