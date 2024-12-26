package Inheritance;

public class Vehicle {
    String name;

    Vehicle(String name) {
        this.name = name;
    }

    void go() {
        System.out.println("This " + name + " is moving");
    }

    void stop() {
        System.out.println("This " + name + " has stopped");
    }
}
