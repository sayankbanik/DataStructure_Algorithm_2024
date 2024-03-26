package polymorphism;

public abstract class Car extends Vehicle {
    int numDoors;

    public Car(){
        //super(100);
        System.out.println("Car's Constructor: (default)");
    }

    public Car(int numDoors, int maxSpeed){
         super(maxSpeed);
        System.out.println("Car's Constructor");
        this.numDoors = numDoors;
    }
    public void print(){
        //super.print();
        System.out.println("Cars "+"NumbDoors "+numDoors);
    }

    @Override
    public boolean isMotorized() {
        this.printCar();
        return true;
    }

    public void printMaxSpeed(){
        super.maxSpeed = 150;
        System.out.println(maxSpeed+" "+super.maxSpeed);
    }
    public void printCar(){
        System.out.println("Car print");
    }
}
