package polymorphism;

public class Vehicle {
    private String color;
    protected int maxSpeed;
    public Vehicle(){
        System.out.println("Vehicle Constructor");
    }
    public Vehicle(int maxSpeed){
        System.out.println("Vehicle Constructor");
        this.maxSpeed = maxSpeed;
    }
    public void print(){
        System.out.println("Vehicle "+" Color "+color+" MaxSpeed "+maxSpeed);
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
