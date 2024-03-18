package inheritance;

public class Person {
    public String name;
    protected String emailID;
    private String phoneNumber; // it is now accessible by Person class
    protected String Address;
    public int age = 85;

    public Person(){
        System.out.println("Person's Constructor");
    }
    public Person(int age){
        System.out.println("Person's Constructor");
        this.age = age;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public void print(){
//        print(); recursive call

        System.out.println("Person name "+name+" emailID "+emailID+" phoneNumber "+phoneNumber+" Address "+Address+" age "+age);
        //System.out.println(name+" "+emailID+" "+phoneNumber+" "+Address+" "+age);

    }
}
