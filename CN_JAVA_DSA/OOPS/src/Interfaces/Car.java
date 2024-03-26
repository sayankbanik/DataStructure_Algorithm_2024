package Interfaces;

public class Car extends Vehicle implements VehicleInterface,CarInterface{
    public void printCar(){
        System.out.println("Car : Class");
    }

    public void print(){
        System.out.println("Car: Class");
    }
    @Override
    public boolean isMotorized() {
        return true;
    }

    @Override
    public String getCompany() {
        return null;
    }

    @Override
    public int numGears() {
        return 4;
    }
}
