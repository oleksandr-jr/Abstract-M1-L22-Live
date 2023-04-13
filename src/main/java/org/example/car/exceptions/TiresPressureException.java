package org.example.car.exceptions;

public class TiresPressureException extends SensorException {
    public TiresPressureException() {
    }

    public TiresPressureException(String message) {
        super(message);
    }
}
