package org.example.car.exceptions;

public class EngineTemperatureException extends SensorException{
    public EngineTemperatureException() {
    }

    public EngineTemperatureException(String message) {
        super(message);
    }
}
