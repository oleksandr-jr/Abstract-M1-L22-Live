package org.example.car.parts;

import org.example.car.exceptions.EngineTemperatureException;
import org.example.car.exceptions.SensorException;
import org.example.car.exceptions.TiresPressureException;
import org.example.car.sensors.EngineTemperatureSensor;
import org.example.car.sensors.Sensor;
import org.example.car.sensors.TiresPressureSensor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class BoardComputer {

    ArrayList<Sensor> sensors = new ArrayList<>(){{
        add(new EngineTemperatureSensor());
        add(new TiresPressureSensor());
    }};


    public boolean checkSensors() {
        for (Sensor sensor : sensors) {
            try {
                sensor.check();
            } catch (SensorException e) {

                System.out.println(e.getMessage());
            }
        }


        return true;
    }
}
