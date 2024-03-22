package fraction;

import java.util.Scanner;

public class FractionUse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fraction f1 = new Fraction(8,24);
        int  denominator  = sc.nextInt();
        try{
            f1.setDenominator(denominator);
        }catch(DividedByZeroException e){
            System.out.println("DividedByZeroException");
        }
        catch(Exception e){
            System.out.println("Generic Exception");
        }finally {
            sc.close();
        }
        f1.print();
//        f1.setDenominator();
//        f1.getDenominator();
//        f1.setNumerator();
//        f1.getDenominator();
//        f1.increment();
//        f1.print();
//        f1.increment();
//        f1.print();
        Fraction f2 = new Fraction(4,8);
        f2.print();
//        f1.add(f2.getNumerator(),f2.getDenominator());
//        f2.add(f1.getNumerator(), f1.getDenominator());
//        f1.add(f2);
//        f1.print();
        Fraction f3 = Fraction.add(f1,f2);
        f3.print();
//        f1.subtract(f2);
//        f1.print();
        f1.multiply(f2);
        f1.print();

    }
}
