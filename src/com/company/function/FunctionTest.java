package com.company.function;

import java.util.function.Function;

class Employee {
    public static void getEmployee () {
        System.out.println("employee get");
    }
}

public class FunctionTest {
    public static void main(String[] args) {
        Employee e = null;   /// reference is null then also it can call static method.
        e.getEmployee();
        Employee.getEmployee();

        Function<Integer, Integer> mainFunc = x -> x + 5;
        Function<Integer, Integer> mainFunc1 = x -> x * 2;
        System.out.println(mainFunc.apply(5)); //10
        System.out.println(mainFunc.andThen(mainFunc1).apply(5)); // 20
        System.out.println(mainFunc.compose(mainFunc1).apply(5)); // 15

        FunctionTest ft =new FunctionTest();
        System.out.println(ft.customFunc(s -> "Hello Pramod"));
    }


    public  String customFunc(Function<FunctionTest, String> strFunc) {
        return strFunc.apply(this);
    }


}
