package com.company.generics.generics1;

import java.util.ArrayList;
import java.util.List;

public class GenericsTester {

    public static void addCat(List<? super Cat> catList) {
        // all list are welcome which are superType of Cat and Cat itself
        // we are restricting this method to add Cat or subtypes of Cat
        catList.add(new RedCat());   // RedCat extends Cat
        catList.add(new Cat());      // Cat itself
        
//        catList.add(new Dog());      // compile error
//        catList.add(new Animal());   // compile error
        System.out.println("addCat method::"+catList.size());
        System.out.println("Cat Added");
    }

    public static void main(String[] args) {
        List<? extends Cat> redCats = new ArrayList<>();
//        redCats.add(new RedCat());  doesn't work
//        redCats.add(new Animal());
//        redCats.add(new Cat());
//        redCats.add(new Dog());
//        redCats.add(new Object());

        List<Animal> animalList= new ArrayList<Animal>();
        List<Cat> catList= new ArrayList<Cat>();
        List<Object> ObjList= new ArrayList<Object>();
        List<RedCat> redCatList= new ArrayList<RedCat>();
        List<Dog> dogList= new ArrayList<Dog>();

        ObjList.add(new Object());
        ObjList.add(new Animal());
        ObjList.add(new Cat());
        ObjList.add(new RedCat());
        ObjList.add(new Dog());



        //add list of super class Animal of Cat class
//        animalList.add(new Animal());
//        animalList.add(new Cat());
//        animalList.add(new RedCat());
//        animalList.add(new Dog());

        System.out.println(animalList.size());

        addCat(animalList);

        System.out.println(animalList.size());


        animalList.add(new Cat());
        animalList.add(new RedCat());
        animalList.add(new Dog());


        System.out.println(animalList.size());
        System.out.println(animalList.get(0));
        System.out.println(animalList.get(1));
        System.out.println(animalList.get(2));

        //add list of Cat class
        addCat(catList);

        addCat(ObjList);

        //compile time error
        //can not add list of subclass RedCat of Cat class
        //addCat(redCatList);

        //compile time error
        //can not add list of subclass Dog of Superclass Animal of Cat class
        //addCat(dogList);
    }
}
class Animal {}

class Cat extends Animal {}

class RedCat extends Cat {}

class Dog extends Animal {}