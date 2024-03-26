package Generics;

public class PairUse {
    public static void main(String[] args) {
        Pair<String,Integer> pInner = new Pair<>();
         System.out.println(pInner); // Generics.Pair@c818063
        Pair<Pair<String,Integer>,Integer> p1 = new Pair<>();
        System.out.println(p1.getFirst()); // pair type -- non-primitive type -- default value --> null
        System.out.println(p1.getSecond()); // Integer type -- non-primitive type -- default value --> null
        p1.setFirst(pInner);
        System.out.println(p1.getFirst()); //  Generics.Pair@c818063
        System.out.println(p1.getFirst().getFirst());
        System.out.println(p1.getFirst().getSecond());
        p1.getFirst().setFirst("First");

//        Pair<String,Integer> p  = new Pair<>("xyz",45);
//        Pair<Pair,String> pPS = new Pair<Pair,String>(p,"abc");
//        System.out.println(pPS.getFirst().getFirst()); // xyz
//        System.out.println(pPS.getFirst().getSecond()); // 45
//        System.out.println(pPS.getSecond()); // abc
//
//
//        Pair<String,Integer> pSI = new Pair<String,Integer>("xyz",141);
//        System.out.println(pSI.getFirst()+" "+pSI.getSecond());
//
//        Pair<Integer,Double> pID = new Pair<>();
//        System.out.println(pID.getFirst()+" "+pID.getSecond()); // null null

//        Pair pInt = new Pair(10,20);
//        pInt.setSecond("abc");
//        pInt.setFirst(10);
//        System.out.println(pInt.getFirst() + " " + pInt.getSecond());

//        PairString ps= new PairString("ss","kk");
//        PairDouble pd = new PairDouble(3.14,8.46);

//        Pair<String> ps = new Pair<String>("aa","bb");
////        System.out.println(ps); // Generics.Pair@c818063
//        System.out.println(ps.getFirst()+" "+ps.getSecond());
//
//        Pair<Integer> pint = new Pair<>(10,30);
//        pint.setFirst(34);
//        System.out.println(pint.getFirst()+" "+pint.getSecond());
//
//        Pair<Double> pd = new Pair<Double>(3.14,8.46);
//        System.out.println(pd.getFirst()+" "+pd.getSecond());
//
//        Pair<String> p = new Pair<>();
//        System.out.println(p.getFirst()+" "+p.getSecond());//        int i1 = 14;
//
//        Integer i = 14;
//        System.out.println(i);
//        String answer = "42";

    }
}
