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
    public void printStudent(){
        System.out.println("Student Class");
        System.out.println(name+" "+emailID+" "+phoneNumber+" "+Address+" "+age);
        System.out.println(name+" "+emailID+" "+phoneNumber+" "+Address+" "+age+" "+rollNumber+" "+courseName);

    }

}
