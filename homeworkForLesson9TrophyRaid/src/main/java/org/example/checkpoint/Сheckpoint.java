package org.example.checkpoint;

public class Сheckpoint {
    private String name;
    private double latitude;
    private double longitude;
    private String checkpointType;


    public Сheckpoint(String checkpointType) {
        this.checkpointType = checkpointType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("-----" +checkpointType+"-----");
        builder.append("\nName: " + name);
        builder.append("\nLatitude: " + latitude);
        builder.append("\nLongitude: " + longitude);

        return builder.toString();
    }
}
