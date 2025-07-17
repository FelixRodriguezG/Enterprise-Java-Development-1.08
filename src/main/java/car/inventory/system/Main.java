package car.inventory.system;
import car.inventory.system.factory.Sedan;
import car.inventory.system.factory.Truck;
import car.inventory.system.factory.UtilityVehicle;

public class Main {
    public static void main(String[] args) {

        // Create instances of different car types
        Sedan sedan = new Sedan("1HGCM82633A123456", "Honda", "Accord", 50000);
        UtilityVehicle utilityVehicle = new UtilityVehicle("1FTRX18W51NA12345", "Ford", "F-150", 30000, true);
        Truck truck = new Truck("1GCHK23D54F123456", "Chevrolet", "Silverado", 40000, 10000.0);
        // Print information about each car
        System.out.println(
                "==================================================================================================");
        System.out.println("Car Inventory System");
        System.out.println(
                "==================================================================================================");
        System.out.println(sedan.getInfo());
        System.out.println(utilityVehicle.getInfo());
        System.out.println(truck.getInfo());
        System.out.println(
                "==================================================================================================");
        // Example of setting and getting properties
        System.out.println("Updating properties of cars...");
        System.out.println(
                "==================================================================================================");

        sedan.setMileage(52000);
        System.out.println("Updated Sedan Mileage: " + sedan.getMileage());
        utilityVehicle.setMake("Ford Updated");
        System.out.println("Updated Utility Vehicle Make: " + utilityVehicle.getMake());
        truck.setModel("Silverado Updated");
        System.out.println("Updated Truck Model: " + truck.getModel());
        // Example of getting VIN number
        System.out.println("Sedan VIN: " + sedan.getVinNumber());
        System.out.println("Utility Vehicle VIN: " + utilityVehicle.getVinNumber());
        System.out.println("Truck VIN: " + truck.getVinNumber());

        }

}
