package org.example.Cars;

public class PassengerCarBuilder implements CarBuilder {
    private final Car car = new Car("PASSENGER_CAR");

    @Override
    public void buildLicensePlate() {
        car.setLicensePlate("PASSENGER_CAR");
    }

    @Override
    public void buildColor() {
        car.setColor("GREEN");
    }

    @Override
    public void buildPower() {
        car.setPower("150");
    }

    @Override
    public void buildFuelReserve() {
        car.setFuelReserve("50");
    }

    @Override
    public Car getCar() {
        return car;
    }
}
