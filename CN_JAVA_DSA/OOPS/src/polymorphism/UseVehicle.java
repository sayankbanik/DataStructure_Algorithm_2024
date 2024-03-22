package polymorphism;

public class UseVehicle {
    public static void main(String[] args) {
//        Vehicle v1 = new Vehicle();
        Vehicle v = new Car(4, 125);
        v.print();  // car's print()  --> Runtime Polymorphism
        // now i am removing print() from Car class
        v.print(); // vehicle's print()
//        v = new MotorCycle();
//        v.maxSpeed = 100;
//        v.numDoors = 4;  // compileTimeError : not belongs to Vehicle
//        Car c = new Car(4,150);
//        c.numDoors = 8; // noError : belongs to Car

    }
}
