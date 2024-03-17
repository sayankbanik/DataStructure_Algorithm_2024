package fraction;

public class Fraction {
    private int numerator;
    private int denominator;
    public Fraction(int numerator, int denominator) {
        if(denominator == 0){
            // throw error
            denominator = 1;
        }
        this.numerator = numerator;
        this.denominator = denominator;
        this.simplify();
    }
    // methods
    public void print(){
        System.out.println(numerator+"/"+denominator);
        simplify();
    }
    private void simplify(){
        int gcd = 1;
        int smaller = Math.min(numerator,denominator);
        for(int i=2;i<=smaller;i++){
            if(denominator % i==0 && numerator%i==0){
                gcd = i;
            }
        }
        numerator = numerator / gcd;
        denominator = denominator / gcd;
    }
    public void increment(){
        numerator = numerator + (denominator);
    }
    public void add(int numerator, int denominator){ //
        int addDenominator = this.denominator * denominator;
        int addNumerator = (addDenominator/this.denominator)*this.numerator + (addDenominator/denominator)*numerator;
        System.out.println(addNumerator+"/"+addDenominator);
    }
    public void add(Fraction f){
        // First fraction is called via function
        // Second fraction is passed as an argument
        this.numerator = this.numerator*f.denominator + this.denominator*f.numerator;
        this.denominator = this.denominator * f.denominator;
        simplify();
    }
    public static Fraction add(Fraction first, Fraction second){  // return type fraction
        int newNumerator = first.numerator*second.denominator + first.denominator*second.numerator;
        int newDenominator = first.denominator * second.denominator;
        Fraction ansAdd = new Fraction(newNumerator,newDenominator);
        //ans.simplify();
        return ansAdd;
    }
    public void subtract(Fraction f){
        this.numerator = this.numerator*f.denominator - this.denominator*f.numerator;
        this.denominator = this.denominator * f.denominator;
        simplify();
    }
    public void multiply(Fraction f){
        this.numerator = this.numerator * f.numerator;
        this.denominator = this.denominator * f.denominator;
        simplify();
    }
    // Getters and Setters
    public void setNumerator(int numerator){
        this.numerator = numerator;
        simplify();
    }
    public int getNumerator(){
        return this.numerator;
    }
    public void setDenominator(int denominator){
        if(denominator <= 0) return;
        this.denominator = denominator;
        simplify();
    }
    public int getDenominator(){
        return denominator;
    }
}
