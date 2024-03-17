package classandobjects;

public class UseStudent {
    public static void main(String[] args) {
        // Student.numStudents = 100;
        System.out.println(Student.getNumStudents());
        // Student s1 = new Student(); // default constructor
        Student s1 = new Student("Sayan",141); // defined constructor
        // print the address of the object
        //System.out.println(s1); // Student@c818063 ; className@hexadecimalCode 0-9
        System.out.println(Student.getNumStudents());
        // Student s2 = new Student(); // default constructor
        Student s2 = new Student("Arisu",123);
       // System.out.println(s2);
            System.out.println(Student.getNumStudents());
        // suppose roll number is not mandatory to create any object of Student class
        Student s3= new Student("Kei");
        System.out.println(Student.getNumStudents());
        Student s4 = new Student();
        System.out.println(Student.getNumStudents());

//        s1.print();
//        s2.print();
//        s3.print();
//        s4.print();
        s4.studentName = "Honami";
        // s4.rollNumber = 123; // not going to work set as private
        // s2.rollNumber = 963; not going to work set as private
        //s4.setRollNumber(369);
        //s4.print();
        Student s5 = new Student("Kiyotaka");
        System.out.println(Student.getNumStudents());
        s5.print();
       // s5.setRollNumber(951);
        s5.print();
        Student s6 = new Student("Kiyotaka",456);
        // with constructor, we can directly invoke value in private members
        s6.print();
//        System.out.println(s1.studentName+" "+s1.getRollNumber()+" "+s1.studentId+" "+s1.emailID); // +s1.rollNumber+" "
//        System.out.println(s2.studentName+" "+s2.getRollNumber()+" "+s2.studentId+" "+s2.emailID); // +s2.rollNumber+" "
//        System.out.println(s3.studentName + " "+s3.getRollNumber());

        // writing the property
//        s1.studentName = "Sayan Kansabanik";
//        // s1.rollNumber = 41;
//        s1.studentId = 123_412_456L;
//        s2.studentName = "Suzune Horikita";
//        s3.setRollNumber(251);
//        System.out.println();
//        System.out.println(s1);  // s1 @ --> classandobjects.Student@c818063
//        s1.setRollNumber(12);   //  this @ --> classandobjects.Student@c818063
//        System.out.println(s2); // s2 @ --> classandobjects.Student@3f0ee7cb
//        s2.setRollNumber(15);   // this @ --> classandobjects.Student@3f0ee7cb
//        s2.setRollNumber(-10); // this is invalid ; it can be solved in setter method
//        // s2.rollNumber = 1;
        // reading the property
//        System.out.println();
//        System.out.println(s1.studentName); // + " "+s1.rollNumber);
//        System.out.println(s1.studentName + " " + s1.getRollNumber());
//        System.out.println(s2.studentName); // + " "+s2.rollNumber);
//        System.out.println(s2.studentName + " " + s2.getRollNumber());
//        System.out.println(s3.studentName);
//        System.out.println(s3.studentName+" "+s3.getRollNumber());


        //
        Test test = new Test();
        s1.cgpa = 8.96;
//        s1.conversionFactor = 0.69; // cannot assign a value to a final variable
        System.out.println(s1.getNumStudents());
        System.out.println(s2.getNumStudents());
        System.out.println(s3.getNumStudents());
        System.out.println(s4.getNumStudents());
        System.out.println(s5.getNumStudents());


    }
}
