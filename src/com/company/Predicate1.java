package com.company;

import java.util.function.Predicate;

public class Predicate1 {

    public static void main(String[] args) {
        Employee e = new Employee();
        e.setAge(60);

        Predicate<Employee> i  = Predicate1.isAgeMoreThan(50);
        System.out.println(i.test(e));
    }

    public static Predicate<Employee> isAgeMoreThan(Integer age) {
        return p -> p.getAge() > age;
    }
}

class Employee {
    int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
