package car.inventory.system.factory;

import car.inventory.system.model.Car;

public class UtilityVehicle extends Car {

    private boolean fourWheelDrive;

    public UtilityVehicle(String vinNumber, String make, String model, int mileage, boolean fourWheelDrive) {
        super(vinNumber, make, model, mileage);
        this.fourWheelDrive = fourWheelDrive;
    }

    @Override
    public String getInfo() {
        return super.getInfo() +  "Four Wheel Drive:" + this.fourWheelDrive;

    }
}