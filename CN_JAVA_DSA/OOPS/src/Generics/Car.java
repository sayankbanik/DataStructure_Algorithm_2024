package Generics;

public class Car implements PrintInterface {

    int numDoors;
    String model;

    public Car(int numDoors, String model) {
        this.numDoors = numDoors;
        this.model = model;
    }

    @Override
    public void print() {
        System.out.println(numDoors + " " + model);
    }
}
