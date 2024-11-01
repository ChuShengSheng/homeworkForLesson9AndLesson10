package org.example.impl;

import org.example.LightState;
import org.example.TrafficLightFactory.TrafficLight;

public class TrafficLightImpl implements TrafficLight {
    private LightState currentState;

    public TrafficLightImpl(LightState startState) {
        this.currentState = startState;
    }

    @Override
    public void lightUp() {
        currentState.lightUp();
        currentState.goToNextState(this);
    }

    @Override
    public void setState(LightState lightState) {
        currentState = lightState;
    }
}
