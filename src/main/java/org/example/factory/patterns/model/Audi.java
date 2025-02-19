package org.example.factory.patterns.model;

import org.example.factory.patterns.interfaces.Car;
import org.example.util.GlobalLogger;

import java.util.logging.Level;

public class Audi implements Car {

    @Override
    public void move() {
        GlobalLogger.log(Level.INFO, "BMW is stopping");
    }

    @Override
    public void stop() {
        GlobalLogger.log(Level.INFO, "Audi is stopping");
    }
}
