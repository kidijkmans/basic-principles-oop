package abstraction;

/*
 * Abstraction = hiding unnecessary details from the user
 */

/*
 * Interface = a blueprint/outline for a class
 * - variables are by default static and final (no non-static and non-final variables accepted)
 * - methods are by default abstract (no normal methods accepted)
 * - no implementation details
 * - cannot be instantiated
 */
public interface BikeInterface {

    void setRentalStatus(String newRentalStatus);

    String getRentalStatus();
}

/*
 * Class implements the interface 'BikeInterface'
 * - IS-A relationship (a RoadBike is a Bike)
 */
class RoadBike implements BikeInterface {

    String rentalStatus;

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
class RunRoadBike {
    public static void main(String[] args) {

        RoadBike roadBike = new RoadBike();

        roadBike.setRentalStatus("on loan");

        System.out.println(
                "The road bike's rental status: " + roadBike.getRentalStatus());

    }
}