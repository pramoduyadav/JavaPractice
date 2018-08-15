package com.company;

public class Employee1 {

    String name;
    String age;
    final String department="23213";


    public static int hello() {
        return 1;
    }

    public String getName() {
        return name;
    }

    public Employee1 setName(String name) {
        this.name = name;
        return this;
    }

    public String getAge() {
        return age;
    }

    public Employee1 setAge(String age) {
        this.age = age;
        return this;
    }

    public String getDepartment() {
        return department;
    }

    public Employee1 setDepartment(String department) {
        //this.department = department;
        return this;
    }


    public static void main(String[] args) {
        Employee1 e = new Employee1();
        e.setName("Harish")
         .setAge("34")
         .setDepartment("IT");

    }


}


