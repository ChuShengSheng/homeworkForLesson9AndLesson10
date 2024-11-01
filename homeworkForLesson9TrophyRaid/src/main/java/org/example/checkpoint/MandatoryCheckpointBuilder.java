package org.example.checkpoint;

public class MandatoryCheckpointBuilder implements СheckpointBuilder {
    private final Сheckpoint checkpoint = new Сheckpoint("MANDATORY");

    @Override
    public void buildName() {
        checkpoint.setName("MANDATORY");
    }

    @Override
    public void buildLatitude() {
        checkpoint.setLatitude(45.0);
    }

    @Override
    public void buildLongitude() {
        checkpoint.setLongitude(90.0);
    }

    @Override
    public Сheckpoint getCheckpoint() {
        return checkpoint;
    }
}
