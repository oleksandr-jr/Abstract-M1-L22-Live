package org.example.car.exceptions;

public class SensorException extends RuntimeException{
    public SensorException() {
    }

    public SensorException(String message) {
        super(message);
    }
}
