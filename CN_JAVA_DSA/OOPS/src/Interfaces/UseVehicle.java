package Interfaces;

public class UseVehicle {
   /*https://stackoverflow.com/questions/290884/what-is-the-reason-behind-non-static-method-cannot-be-referenced-from-a-static*/
    public static void main(String[] args) {
        VehicleInterface a = new Car();
        a.print();

//        Vehicle v = new Vehicle();
//        v.printVehicle();
////        v.getCompany();
////        v.isMotorized();
////        System.out.println(v.AB);
////        System.out.println(v.getCompany());
//
////        VehicleInterface vu = new VehicleInterface(); not possible
////        VehicleInterface vu = new Vehicle();
////        vu.getCompany();
////        vu.isMotorized();
////        vu.printVehicle(); not accessible
//        Vehicle v2 = new Car();
//        Car c = new Car();
//        c.printCar();
//        c.printVehicle();
//        c.getCompany();
//        c.isMotorized();
        //System.out.println(c.AB);
//        VehicleInterface vi = new VehicleInterface(){
//            @Override
//            public boolean isMotorized() {
//                return false;
//            }
//
//            @Override
//            public String getCompany() {
//                return null;
//            }
//        };



    }

}
