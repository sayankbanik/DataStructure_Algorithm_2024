package complexnumber;

public class ComplexNumber {
    private int real;
    private int imaginary;

    public ComplexNumber(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // methods
    public void print() {
        System.out.println(this.real + "+" + this.imaginary + "i");
    }
    public void add(ComplexNumber c){
        this.real = this.real + c.real;
        this.imaginary = this.imaginary + c.imaginary;
    }
    public void multiply(ComplexNumber c2){
        int temp = this.real;
        this.real = this.real * c2.real + ((-1)*(this.imaginary*c2.imaginary));
        this.imaginary = temp * c2.imaginary + this.imaginary * c2.real;
    }
    public static ComplexNumber add(ComplexNumber c1, ComplexNumber c2){
        int newReal = c1.real + c2.real;
        int newImaginary = c1.imaginary + c2.imaginary;
        ComplexNumber ansAdd = new ComplexNumber(newReal,newImaginary);
        return ansAdd;
    }
    // getters and setters
    public int getReal() {
        return this.real;
    }
    public void setReal(int real) {
        this.real = real;
    }
    public int getImaginary(){
        return this.imaginary;
    }
    public void setImaginary(int imaginary){
        this.imaginary = imaginary;
    }

}