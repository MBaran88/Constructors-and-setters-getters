package org.mytools.myclasses;

/**
 * Created by RENT on 2017-04-26.
 */
public class Car {
    int wheelCount = 4;
    String brand = "skoda";

    Car[] similarCars;

    public Car(int wheelCount, String brand) {
        this.wheelCount = wheelCount;
        this.brand = brand;
    }

    Car similarCar = new Car();

    Car(){}
    void doBLink() {

        System.out.println("blink blink!");
    }

    public void doBlink() {
    }
}
