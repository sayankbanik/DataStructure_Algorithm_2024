package polymorphism;

import java.util.Scanner;

public class UseVehicle {
    public static void main(String[] args) {
        Object o = new Vehicle();

        Vehicle v = new Car(4, 125);

        // v = new MotorCycle();
        Car c = (Car)v; // class cast
        c.numDoors = 10;
        c.print();

//        Car c = new Vehicle();
////        Vehicle v1 = new Vehicle();
//        Vehicle v = new Car(4, 125);
//        v.print();  // car's print()  --> Runtime Polymorphism
//        // now i am removing print() from Car class
//        v.print(); // vehicle's print()
//
//
//        Car c = new Car(4,100);
//        c.printMaxSpeed(); // belongs to Car class
//        c.getColor(); // belongs to Vehicle's class
//        Vehicle v2 = new Vehicle();
//        v2.notify(); // belongs to Object class
//        v2.print();  // belongs to Vehicle Class
//        // v2.printMaxSpeed() // not accessible, as this method only belongs to Car(child) class
//
//        Vehicle v1;
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        if(n<10){
//            v1 = new Car(4,200);
//        }else{
//            v1 = new Vehicle();
//        }
//        v1.print();
//
////        Car c = new Vehicle(); ---> ERROR ; every vehicle is not a car
////        v = new MotorCycle();
////        v.maxSpeed = 100;
////        v.numDoors = 4;  // compileTimeError : not belongs to Vehicle
////        Car c = new Car(4,150);
////        c.numDoors = 8; // noError : belongs to Car
//        Object obj = new Object();


    }
}
