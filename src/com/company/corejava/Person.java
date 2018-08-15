package com.company.corejava;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

public class Person {
    String ssn;
    String name;
    
    public Person(){}
    public Person(String ssn, String name){
        this.ssn = ssn;
        this.name = name;
    }
    public String getId() {
        return ssn;
    }
    public void setId(String id) {
        this.ssn = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(getId(), getName());

    }

    @Override
    public boolean equals(Object obj){
        if (obj == this) {
            return true;
        }
        if (obj instanceof Person) {
            Person other = (Person) obj;
            return Objects.equals(ssn, other.ssn) && Objects.equals(name, other.name);
        }
        return false;
    }
}
