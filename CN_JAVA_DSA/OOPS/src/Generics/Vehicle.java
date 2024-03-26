package Generics;

public class Vehicle implements PrintInterface {
    int maxSpeed;
    String companyName;
    public Vehicle(){
        //print();
    }

    public Vehicle(int maxSpeed, String companyName) {
        this.maxSpeed = maxSpeed;
        this.companyName = companyName;
    }
    public void print(){
        System.out.println(maxSpeed+" "+companyName);
    }
}
