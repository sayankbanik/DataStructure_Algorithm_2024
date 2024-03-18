package inheritance;

public class usePerson {
    public static void main(String[] args){

        Person p = new Person();
        p.name = "Sayan";
        p.emailID = "abc@email";
        p.Address ="asdfvgbhjkl";
        p.age = 25;
        p.phoneNumber = "9951753456";
        p.print();


        Student s = new Student();
        s.print();
        s.printStudent();
        // p.printStudent();  // not possible
        Person ps = new Student("optics");  // possible ; because student is also a person
        System.out.println(ps.name);
        ps.print();



        Teacher t = new Teacher();
//        t.print();
//        t.printTeacher();
    }
}
