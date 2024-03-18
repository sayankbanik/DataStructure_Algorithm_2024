package classandobjects;

public class Student {
    String studentName; // default ; only within the same package
    public long studentId;
    final private int rollNumber;  // private ; only within the same class
    // rollnumber made as final because once the value is assigned in rollnumber it should not be changed
    String emailID;
    String enrolledCourse;
    double cgpa;
    public static final double CONVERSIONFACTOR = 0.95; // it can't be modified
    private static int numStudents;


    // default constructor
    public Student(){
        this.studentName = "null";
        // this.rollNumber = 1000;
        numStudents++;
        this.rollNumber = numStudents;
        this.print();
//        conversionFactor = 0.32; error

    }
    public Student(String studentName){
        this.studentName = studentName;
        //this.rollNumber = 1000; // default
        numStudents++;
        this.rollNumber = numStudents;
        this.print();
    }
    public Student(String studentName, int rollNumber){
        this.studentName = studentName;
        // this.rollNumber = rollNumber;
        numStudents++;
        this.rollNumber = numStudents;
        this.print();
    }
    public int getRollNumber(){
        return this.rollNumber;
    }

    public void setRollNumber(int rollNumber){
        if(rollNumber <=0){
            return;
        }
        // System.out.println(this);  it will provide same address as the object reference
        //this.rollNumber = rollNumber;
    }
    public void print(){
        System.out.println(studentName+" "+rollNumber);
    }
    public static int getNumStudents(){
        // System.out.println(studentName); static function cant hold th a non-static variable
        return numStudents;
    }
}
