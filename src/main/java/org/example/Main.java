package org.example;

import org.example.factory.patterns.factoties.CarFactory;
import org.example.factory.patterns.interfaces.Car;
import org.example.util.GlobalLogger;

import static java.util.logging.Level.INFO;

public class Main {
    public static void main(String[] args) {


        // FACTORY PATTERN
        GlobalLogger.log(INFO,"\r\n////////////////////// FACTORY PATTERN //////////////////////");
        GlobalLogger.log(INFO,"Creating new cars with Factory Pattern");
        Car myNewCar = CarFactory.getCar("BMW");
        Car yourNewCar = CarFactory.getCar("Jeep");

        // Execução dos carros em threads diferentes
        Thread thread1 = new Thread(new CarRunnable(myNewCar));
        Thread thread2 = new Thread(new CarRunnable(yourNewCar));

        thread1.start();
        thread2.start();

        // Usei o .join() para garantir que a execução do programa só continue após a execução das threads
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        GlobalLogger.log(INFO,"////////////////////// END OF FACTORY PATTERN //////////////////////");

        // END OF FACTORY PATTERN

        // SINGLETON PATTERN

        GlobalLogger.log(INFO,"\r\n\r\n\r\n\r\n////////////////////// SINGLETON PATTERN //////////////////////");

        GlobalLogger.log(INFO,"Creating a new car with Singleton Pattern");
        org.example.singleton.Car myCar = org.example.singleton.Car.getInstance("Toyota Camry", 2025);
        // Strings Templates não estão disponíveis no Java 23, então estou usando o jeito antigo
        // I think String Templates are not available in Java 23 anymore by a quick search I did
        // "this feature has been withdrawn for further redesign", so I'm using the old way
        GlobalLogger.log(INFO,"Model: " + myCar.getModel());
        GlobalLogger.log(INFO,"Year: " + myCar.getYear());

        // Tentando criar outra instância e vai retornar o mesmo objeto
        // Attempting to create another instance will return the same object
        GlobalLogger.log(INFO,"\r\nTrying to create another instance of the same car");
        org.example.singleton.Car anotherCar = org.example.singleton.Car.getInstance("Honda Civic", 2022);
        GlobalLogger.log(INFO,"Model: " + myCar.getModel());
        GlobalLogger.log(INFO,"Year: " + myCar.getYear());
        GlobalLogger.log(INFO,"If the car model and year are the same, then the Singleton Pattern is working correctly");

        GlobalLogger.log(INFO,"////////////////////// END OF SINGLETON PATTERN //////////////////////");
        // END OF SINGLETON PATTERN
    }

    /**
     * Classe interna que implementa {@link Runnable} para encapsular a lógica de execução dos métodos
     * {@link Car#move()} e {@link Car#stop()} dos carros, usada no teste de factory patterns.
     */
    static class CarRunnable implements Runnable {
        private final Car car;

        public CarRunnable(Car car) {
            this.car = car;
        }

        @Override
        public void run() {
            car.move();
            car.stop();
        }
    }
}
