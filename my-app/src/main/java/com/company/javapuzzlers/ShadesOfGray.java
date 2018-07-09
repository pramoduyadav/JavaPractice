package com.company.javapuzzlers;

public class ShadesOfGray {
    public final static void main(String[] args){
        System.out.println(Ex.Why.z);
    }
}
class Ex {
    static class Why {
        static String z = "Black";
    }
    static See y = new See();
}
class See {
    String z = "White";
}

//public class ShadesOfGray {
//    public static void main(String[] args){
//        System.out.println(X.Y.Z);
//    }
//}
//class X {
//    static class Y {
//        static String Z = "Black";
//    }
//    static C Y = new C();
//}
//class C {
//    String Z = "White";
//}
//
//
