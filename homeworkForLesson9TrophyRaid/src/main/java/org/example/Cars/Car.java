package org.example.Cars;

public class Car {
    private String licensePlate;
    private String color;
    private String power;
    private String fuelReserve;
    private String carType;

    public Car(String carType) {
        this.carType = carType;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getFuelReserve() {
        return fuelReserve;
    }

    public void setFuelReserve(String fuelReserve) {
        this.fuelReserve = fuelReserve;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("----- "+carType+"-----\n");
        builder.append("\nLicense Plate: "+licensePlate);
        builder.append("\nColor: "+color);
        builder.append("\nPower: "+power);
        builder.append("\nFuel Reserve: "+fuelReserve);

        return builder.toString();
    }
}
