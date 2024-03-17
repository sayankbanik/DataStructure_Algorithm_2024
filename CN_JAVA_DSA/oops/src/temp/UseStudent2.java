package temp;

import classandobjects.Student;

public class UseStudent2 {
    public static void main(String[] args) {
        Student s1 = new Student("abc",100);
        s1.studentId = 123456; // working because property set as public

         // s1.studentName // not working inside this package as the property is default
    }
}
