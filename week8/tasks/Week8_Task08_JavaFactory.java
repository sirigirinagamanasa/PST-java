
interface Vehicle {
    void drive();
}

class Car implements Vehicle {
    public void drive() {
        System.out.println("Car is driving");
    }
}

class Bike implements Vehicle {
    public void drive() {
        System.out.println("Bike is driving");
    }
}

class VehicleFactory {
    public Vehicle getVehicle(String type) {
        if (type.equalsIgnoreCase("car")) {
            return new Car();
        } else if (type.equalsIgnoreCase("bike")) {
            return new Bike();
        }

        return null;
    }
}

public class Week8_Task08_JavaFactory {
    public static void main(String[] args) {
        VehicleFactory factory = new VehicleFactory();

        Vehicle v1 = factory.getVehicle("car");
        Vehicle v2 = factory.getVehicle("bike");

        v1.drive();
        v2.drive();
    }
}
