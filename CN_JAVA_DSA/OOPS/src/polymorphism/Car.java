package polymorphism;

public class Car extends Vehicle {
    int numDoors;

    public Car(int numDoors, int maxSpeed){
        // super(maxSpeed);
        System.out.println("Car's Constructor");
        this.numDoors = numDoors;
    }
    public void print(){
        //super.print();
        System.out.println("Cars "+"NumbDoors "+numDoors);
    }
    public void printMaxSpeed(){
        super.maxSpeed = 150;
        System.out.println(maxSpeed+" "+super.maxSpeed);
    }
}
