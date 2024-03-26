package polymorphism;

public abstract class MotorCycle extends Vehicle{
    public MotorCycle(){
        super(100);
    }

    public void printMotorCycle(){
        System.out.println("MotorCycle Print");
    }

    @Override
    public boolean isMotorized() {
        this.printMotorCycle();
        return true;
    }
}
