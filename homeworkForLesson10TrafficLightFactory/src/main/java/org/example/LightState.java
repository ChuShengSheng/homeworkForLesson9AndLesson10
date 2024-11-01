package org.example;

import org.example.TrafficLightFactory.TrafficLight;

public enum LightState {
    GREEN("Зелёный") {
        @Override
        public void goToNextState(TrafficLight trafficLight) {
            trafficLight.setState(PRE_YELLOW);
        }
    },
    PRE_YELLOW("Жёлтый") {
        @Override
        public void goToNextState(TrafficLight trafficLight) {
            trafficLight.setState(RED);;
        }
    },
    RED("Красный") {
        @Override
        public void goToNextState(TrafficLight trafficLight) {
            trafficLight.setState(POST_YELLOW);;
        }
    },
    POST_YELLOW("Жёлтый") {
        @Override
        public void goToNextState(TrafficLight trafficLight) {
            trafficLight.setState(GREEN);;
        }
    },
    INFINITY_YELLOW("Мигающий жёлтый") {
        @Override
        public void goToNextState(TrafficLight trafficLight) {
            // no logic
        }
    },
    OFF("") {
        @Override
        public void goToNextState(TrafficLight trafficLight) {
            // no logic
        }

        @Override
        public void lightUp() {
            System.out.println("Светофор выключен!");
        }
    };

    private final String color;

    LightState(String color) {
        this.color = color;
    }

    public abstract void goToNextState(TrafficLight trafficLight);

    public void lightUp() {
        System.out.println(color);
    }
}
