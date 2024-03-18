package inheritance;


public class Student extends Person {
    public Student(){
        this.name = "abc";
    }
    public Student(String courseName){
        this.courseName = courseName;
    }
    int rollNumber;
    String courseName;
    int age;
    public void print(){  // printStudent
        System.out.println("Student Class " + name+" "+emailID+" "+getPhoneNumber()+" "+Address+" "+age+" "+rollNumber+" "+courseName);
        super.age = 45;
        super.print();
        //System.out.println(name+" "+emailID+" "+phoneNumber+" "+Address+" "+age);
//        System.out.println(name+" "+emailID+" "+phoneNumber+" "+Address+" "+age+" "+rollNumber+" "+courseName);

    }

}
