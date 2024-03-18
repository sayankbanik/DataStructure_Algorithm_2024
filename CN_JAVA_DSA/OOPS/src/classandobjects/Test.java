package classandobjects;

public class Test {
    int num1;
    int num2;
    public Test(){
        this(10,20); // public Test(10,20)
        // It refers to the constructor of the same class whose parameters matches
        // with the parameters passed to this(parameters).
        System.out.println("Constructor1");
    }
    public Test(int num1, int num2){
        System.out.println("Constructor 2");
    }
}
