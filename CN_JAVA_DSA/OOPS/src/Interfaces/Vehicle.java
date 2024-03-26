package Interfaces;

public /*abstract*/ class Vehicle implements VehicleInterface{


    public void printVehicle(){
        System.out.println("Vehicle: Class");

    }

    @Override
    public boolean isMotorized() {
        return false;
    }

    @Override
    public String getCompany() {
        return null;
    }

    public void print(){
        System.out.println("Vehicle: Class");
    }
//    @Override
//    public boolean isMotorized() {
//        return false;
//    }
//
//    @Override
//    public String getCompany() {
//        return null;
//    }

}
