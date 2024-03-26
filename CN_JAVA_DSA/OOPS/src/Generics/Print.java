package Generics;

public class Print {
    // Generic Method
    public static<Type extends PrintInterface>void printArray(Type[] arr){
        for(int i=0;i<arr.length;i++){
            arr[i].print();
//            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {

        Vehicle[] v = new Vehicle[5];
        //printArray(v); // null null null null null
        System.out.println(" ");
        for(int i=0;i<v.length;i++){
            v[i] = new Vehicle( 100 *i,"BMW");
        }
        printArray(v);
        Car[] c = new Car[5];
        for(int i=0;i<c.length;i++){
            c[i] = new Car(4,"axcvc"+i);
        }
        printArray(c);

        //  Generics.Vehicle@2d209079 Generics.Vehicle@6bdf28bb Generics.Vehicle@6b71769e Generics.Vehicle@2752f6e2 Generics.Vehicle@e580929
//        System.out.println(" ");
//        for (Vehicle vehicle : v) {
//            vehicle.print();
//        }
//        System.out.println(" ");

//        Integer[] arr = new Integer[10];
//        for(int i=0;i<arr.length;i++){
//            arr[i] = i*(i/2);
//        }
//        printArray(arr); // 0 0 2 3 8 10 18 21 32 36
//        System.out.println(" ");
//        String[] arrS = new String[8];
//        for(int i=0;i<arrS.length;i++){
//            arrS[i] = "abc" + 'a'+i;
//        }
//        printArray(arrS);
//        System.out.println(" ");




    }
}
