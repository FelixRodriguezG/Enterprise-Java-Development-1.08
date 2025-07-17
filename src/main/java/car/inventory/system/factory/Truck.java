package car.inventory.system.factory;

import car.inventory.system.model.Car;

public class Truck extends Car {
    private double towingCapacity ;

    public Truck(String vinNumber, String make, String model, int mileage, double loadCapacity) {
        super(vinNumber, make, model, mileage);
        this.towingCapacity  = towingCapacity ;
    }

    @Override
    public String getInfo() {
        return String.format("Vin: %s, Make: %s, Model: %s, Mileage: %d, Towing Capacity: %.2f",
                getVinNumber(), getMake(), getModel(), getMileage(), towingCapacity);
    }

}
