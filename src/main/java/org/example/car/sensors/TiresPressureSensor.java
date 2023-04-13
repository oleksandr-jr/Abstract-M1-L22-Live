package org.example.car.sensors;

import org.example.car.exceptions.TiresPressureException;

public class TiresPressureSensor implements Sensor{

    @Override
    public boolean check(){
        throw new TiresPressureException("Тиск в колесах надто низький");
    }
}
