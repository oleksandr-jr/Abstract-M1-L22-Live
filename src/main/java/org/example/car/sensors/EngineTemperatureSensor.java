package org.example.car.sensors;

import org.example.car.exceptions.EngineTemperatureException;

public class EngineTemperatureSensor implements Sensor{
    int temperature = 150;
    @Override
    public boolean check() throws EngineTemperatureException {
        if (temperature > 100){
            throw new EngineTemperatureException("Температура надто висока " + temperature + "/100 MAX");
        }
        return true;
    }
}
