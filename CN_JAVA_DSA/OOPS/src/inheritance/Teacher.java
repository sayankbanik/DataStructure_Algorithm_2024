package inheritance;

public class Teacher extends Person{
    String employeeID;
    String Qualification;

    public void printTeacher(){
        System.out.println("Teacher Class");
        System.out.println(name+" "+emailID+" "+phoneNumber+" "+Address+" "+age);
        System.out.println(name+" "+emailID+" "+phoneNumber+" "+Address+" "+age+" "+employeeID+" "+Qualification);
    }
}
