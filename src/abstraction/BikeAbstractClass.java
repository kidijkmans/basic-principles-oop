package abstraction;

/*
 * Abstraction = hiding unnecessary details from the user
 */

/*
 * Abstract class = a class that is declared abstract & cannot be instantiated
 * - can contain final, non-final, static and non-static variables
 * - can contain normal and abstract methods
 * - cannot be instantiated
 * - can implement an interface
 */
public abstract class BikeAbstractClass {

    String rentalStatus;

    abstract void setRentalStatus(String newRentalStatus);

    abstract String getRentalStatus();
}

/*
 * Class extends the abstract class 'BikeAbstractClass'
 */
class ElectricBike extends BikeAbstractClass {

    public void setRentalStatus(String newRentalStatus) {
        rentalStatus = newRentalStatus;
    }

    public String getRentalStatus() {
        return rentalStatus;
    }

}

/*
 * Class to run the program and test abstraction
 */
class RunElectricBike {
    public static void main(String[] args) {

        ElectricBike electricBike = new ElectricBike();

        electricBike.setRentalStatus("on loan");

        System.out.println(
                "The electric bike's rental status: " + electricBike.getRentalStatus());

    }
}