package com.company.generics.generics3;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee<String> emp = new Employee<>();
//        emp.addEmployee("Pramod");
//        emp.addEmployee("Manoj");

        emp.getEmployee().stream().forEach(emp1 -> System.out.println(emp1));

    }




}


