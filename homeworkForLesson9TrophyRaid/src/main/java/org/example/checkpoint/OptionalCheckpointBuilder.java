package org.example.checkpoint;

public class OptionalCheckpointBuilder implements СheckpointBuilder {
    private final Сheckpoint checkpoint = new Сheckpoint("OPTIONAL");

    @Override
    public void buildName() {
        checkpoint.setName("OPTIONAL");
    }

    @Override
    public void buildLatitude() {
        checkpoint.setLatitude(90.0);
    }

    @Override
    public void buildLongitude() {
        checkpoint.setLongitude(180.0);
    }

    @Override
    public Сheckpoint getCheckpoint() {
        return checkpoint;
    }
}
