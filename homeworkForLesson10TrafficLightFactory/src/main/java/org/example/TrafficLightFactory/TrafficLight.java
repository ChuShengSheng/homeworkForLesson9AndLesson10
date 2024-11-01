package org.example.TrafficLightFactory;

import org.example.LightState;

public interface TrafficLight {
    void lightUp();

    void setState(LightState lightState);
}
