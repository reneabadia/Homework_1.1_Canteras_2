import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Represents the Person Public Class
 */

public class Person {

    /**
     * Set the native variables of the Person class
     */
    public String name;
    public String lastname1;
    public String lastname2;
    public double height;

    /**
     * Creates Object constructor for Person
     */
    public Person(){}

    /**
     * Method for set name of Person
     */
    public void setName(String name){this.name = name;}

    /**
     * Method for set last name of Person
     */
    public void setLastName(String newLast1, String newLast2){
        this.lastname1 = newLast1;
        this.lastname2 = newLast2;
    }

    /**
     * Method for get name of Person
     */
    public String getName(){
        return this.name;
    }

    /**
     * Method for get last name of Person
     */
    public String getLastName(){
        return (lastname1 + " " + lastname2);
    }

    /**
     * Method for set date-birth and returning as string
     */
    public void setDateBirth(int year, int month, int day){
        Calendar dateBirth = GregorianCalendar.getInstance();
        /**
         * Instance current date
         */
        dateBirth.set(year, month-1, day);
        System.out.print("Date of birth: ");
        System.out.printf("%tB %<te, %<tY \n", dateBirth);
    }

}
