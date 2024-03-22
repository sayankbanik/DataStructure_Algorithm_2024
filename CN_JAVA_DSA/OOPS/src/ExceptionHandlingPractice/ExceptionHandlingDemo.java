package ExceptionHandlingPractice;

import java.util.Scanner;

public class ExceptionHandlingDemo {
    public static int fact(int n) throws NegativeNumberFactorialException{
        if(n<1){
            throw new NegativeNumberFactorialException();
        }
        if(n==1){return 1;}
        return n*fact(n-1);

    }
    public static int divide(int a, int b) throws DividedByZeroException{
        if(b==0){
            // creating a new exception class for this specific exception
            throw new DividedByZeroException();
        }
        return a/b;
    }
    public static void fun() throws Exception{
        throw new Exception();
    }
    public static void main(String[] args) /*throws DividedByZeroException */{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numerator: ");
        int a = sc.nextInt();
        System.out.print("Enter the denominator: ");
        int b = sc.nextInt();
        System.out.print("Enter the Number for Factorial: ");
        int n = sc.nextInt();

        try{
            System.out.println(divide(a,b));
            System.out.println("Success! Division was successful");
            System.out.println(fact(n));
            System.out.println("Success! Factorial was successful");
        }catch(DividedByZeroException e){
            System.out.println("FAILURE!!");
            System.out.println("Divided by Zero Exception.\"Denominator value can not be Zero\"");
            System.out.println();
        }
//        catch(Exception e){
//            System.out.println("Generic Exception");
//        }
        catch(NegativeNumberFactorialException e){
            System.out.println("FAILURE!!!");
            System.out.println("Factorial of Negative Number Exception.");
        }catch(Exception e){
            System.out.println("Generic Exception");
        }
        finally{
            System.out.println("Finally: Exception happened or not, I am always be executed");
        }
        System.out.println("After Exception Handling");
//        System.out.print("Enter the Number for Factorial: ");
//        int n = sc.nextInt();
//        System.out.println(fact(n));
        try{
            fun();
        }catch(Exception e){
            System.out.println("Caught in MAIN");
        }

        try{

        }finally{
            System.out.println("Caught in MAIN");
        };


    }
}
