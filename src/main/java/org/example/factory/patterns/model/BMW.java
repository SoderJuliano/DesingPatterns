package org.example.factory.patterns.model;

import org.example.factory.patterns.interfaces.Car;
import org.example.util.GlobalLogger;

import java.util.logging.Level;

public class BMW implements Car {

    @Override
    public void move() {
        GlobalLogger.log(Level.INFO, "BMW is moving             \uD83D\uDE97\uD83D\uDCA8");
        GlobalLogger.log(Level.INFO, "BMW is moving           \uD83D\uDE97\uD83D\uDCA8");
        GlobalLogger.log(Level.INFO, "BMW is moving         \uD83D\uDE97\uD83D\uDCA8");
        GlobalLogger.log(Level.INFO, "BMW is moving       \uD83D\uDE97\uD83D\uDCA8");
    }

    @Override
    public void stop() {
        GlobalLogger.log(Level.INFO, "BMW has stopped \uD83D\uDE97");
    }
}
