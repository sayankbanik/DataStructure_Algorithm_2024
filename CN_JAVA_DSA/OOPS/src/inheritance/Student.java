package inheritance;


public class Student extends Person {
    public Student(){
//        super(45);
//        super(); // explicitly called; otherwise it will be called implicitly
        System.out.println("Student's Constructor");
    }
//    public Student(String courseName){
//        this.courseName = courseName;
//    }
    int rollNumber;
    String courseName;
    int age = 45;
    public void print(){  // printStudent
        System.out.println("Student " + name+" "+emailID+" "+getPhoneNumber()+" "+Address+" "+age+" "+rollNumber+" "+courseName);

        //super.print();
        //System.out.println(name+" "+emailID+" "+phoneNumber+" "+Address+" "+age);
//        System.out.println(name+" "+emailID+" "+phoneNumber+" "+Address+" "+age+" "+rollNumber+" "+courseName);

    }
    public void display(){
        print();
        super.print();
    }

}
