package org.example;

import org.example.TrafficLightFactory.TrafficLight;
import org.example.impl.TrafficLightImpl;

public class Main {
    public static void main(String[] args) {
        final TrafficLight trafficLight = new TrafficLightImpl(LightState.GREEN);

        trafficLight.lightUp(); // Зелёный
        trafficLight.lightUp(); // Жёлтый
        trafficLight.lightUp(); // Красный
        trafficLight.lightUp(); // Жёлтый
        trafficLight.lightUp(); // Зелёный
        trafficLight.lightUp(); // Жёлтый
        trafficLight.lightUp(); // Красный
        trafficLight.lightUp(); // Жёлтый
        trafficLight.lightUp(); // Зелёный
        trafficLight.setState(LightState.INFINITY_YELLOW);
        trafficLight.lightUp(); // Жёлтый
        trafficLight.lightUp(); // Жёлтый
        trafficLight.lightUp(); // Жёлтый
        trafficLight.lightUp(); // Жёлтый
    }
}