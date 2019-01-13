package com.company.collections.comparator;

import java.util.Arrays;
import java.util.Comparator;

class Employee implements Comparable<Employee> {
    private int employeeId;
    private String employeeName;
    private int employeeSalary;

    public Employee(int id, String name, int sal) {
        this.employeeId = id;
        this.employeeName = name;
        this.employeeSalary = sal;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(int employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", employeeSalary=" + employeeSalary +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return this.employeeId - o.getEmployeeId();
    }
}

public class EmployeeComparator {

    public static Comparator<Employee> nameCmp = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getEmployeeName().compareTo(o2.getEmployeeName());
        }
    };

    public static void main(String[] args) {
        Employee[] empArray = {new Employee(1, "Pramod", 80000),
                new Employee(2, "Harish", 40000),
                new Employee(3, "Raka", 50000)        };

        Arrays.sort(empArray, new SalaryComparator());
        System.out.println(Arrays.toString(empArray));

        Arrays.sort(empArray, nameCmp);
        System.out.println(Arrays.toString(empArray));

        // Anonymous class implementation
        Arrays.sort(empArray, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getEmployeeName().compareTo(o2.getEmployeeName());
            }
        });
        System.out.println(Arrays.toString(empArray));

        // Replaced with Lambda expression
        Arrays.sort(empArray, (o1, o2) -> o1.getEmployeeName().compareTo(o2.getEmployeeName()));
        System.out.println(Arrays.toString(empArray));

        // Normal sorting but object need to implement Comparable interface
        Arrays.sort(empArray);
        System.out.prinNtln(Arrays.toString(empArray));
    }
}

class SalaryComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        if(o1.getEmployeeSalary() > o2.getEmployeeSalary())
            return 1;
        else if (o1.getEmployeeSalary() < o2.getEmployeeSalary())
            return -1;
        else
            return 0;
    }
}


class NameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getEmployeeName().compareTo(o2.getEmployeeName());
    }
}