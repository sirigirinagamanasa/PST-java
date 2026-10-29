class Ride {
    String passenger;
    String pickup;
    String destination;
    double fare;

    Ride(String passenger, String pickup, String destination, double fare) {
        this.passenger = passenger;
        this.pickup = pickup;
        this.destination = destination;
        this.fare = fare;
    }

    void displayRide() {
        System.out.println("Passenger: " + passenger);
        System.out.println("Pickup: " + pickup);
        System.out.println("Destination: " + destination);
        System.out.println("Fare: " + fare);
    }
}

public class Week9_Task2_RideSharingSimulator {
    public static void main(String[] args) {
        Ride ride = new Ride("Ravi", "College", "Bus Stand", 150);

        ride.displayRide();
    }
}
