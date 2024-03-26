package polymorphism;

public abstract/*final*/ class Vehicle {
    private String color;
    protected int maxSpeed;
    public Vehicle(){
        System.out.println("Vehicle Constructor :(Default)");
    }
    public Vehicle(int maxSpeed){
        System.out.println("Vehicle Constructor -- max speed: "+maxSpeed);
        this.maxSpeed = maxSpeed;
    }
    public void print(){
        System.out.println("Vehicle "+" Color "+color+" MaxSpeed "+maxSpeed);
    }
    public void printVehicle(){
        System.out.println("Vehicle print");
    }

    public abstract boolean isMotorized();
    public abstract String getCompany();

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
