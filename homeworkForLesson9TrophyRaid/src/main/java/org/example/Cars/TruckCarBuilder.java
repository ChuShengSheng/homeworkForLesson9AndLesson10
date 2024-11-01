package org.example.Cars;

public class TruckCarBuilder implements CarBuilder {
    private final Car car= new Car("TRUCK");

    @Override
    public void buildLicensePlate() {
        car.setLicensePlate("TRUCK");
    }

    @Override
    public void buildColor() {
        car.setColor("RED");
    }

    @Override
    public void buildPower() {
        car.setPower("300");
    }

    @Override
    public void buildFuelReserve() {
        car.setFuelReserve("100");
    }

    @Override
    public Car getCar() {
        return car;
    }
}
