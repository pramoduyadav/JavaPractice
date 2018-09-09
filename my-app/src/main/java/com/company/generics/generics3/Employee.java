package com.company.generics.generics3;

import java.util.ArrayList;
import java.util.List;

public class Employee<T> {

    private List<T> list1 = new ArrayList<>();
    public  void  addEmployee(T t) {
        list1.add(t);

    }

    public List<T> getEmployee() {
        return list1;
    }



}
