package org.example;

public enum Light {
    RED, AMBER, GREEN,                   // основные цвета
    RED_GREEN_LEFT, RED_GREEN_RIGHT,     // доп. секции
    ;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
