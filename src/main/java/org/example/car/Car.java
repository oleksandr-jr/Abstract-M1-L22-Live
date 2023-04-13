package org.example.car;

import org.example.car.exceptions.EngineTemperatureException;
import org.example.car.parts.BoardComputer;
import org.example.car.parts.Engine;

public class Car {
    Engine engine = new Engine();
    BoardComputer boardComputer = new BoardComputer();

    public void start(){

        if (boardComputer.checkSensors()) {
            engine.start();
            System.out.println("Car has started");
        }else {
            System.out.println("Car has not started");
        }



    }
}
