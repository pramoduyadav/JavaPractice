package com.company.collections;

import java.util.*;
class Book {
    int id;
    String name,author,publisher;
    int quantity;
    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}
public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<Book> hs=new LinkedHashSet<Book>();
        //Creating Books
        Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book b2= b1;
        //Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
        //Adding Books to hash table
        hs.add(b1);
        hs.add(b2);
        hs.add(b3);
        //Traversing hash table
        for(Book b:hs){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }


        HashSet<String> set=new HashSet<String>();
        set.add("Test");
        set.add("Test");
        Iterator<String> itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        ArrayList<String> list=new ArrayList<String>();
        list.add("TTest");
        list.add("TTest");
        Iterator<String> itr1=list.iterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }

        HashMap<String,String> hm=new HashMap<String,String>();
        hm.put("Hello","Test");
        hm.put("World","Test");

        for(String key : hm.keySet()) {
            System.out.println(key);
        }



        ArrayList<String> list1=new ArrayList<String>();
        list1.add("Hello");

        method1(list1);
        Iterator itr3 = list1.iterator();
        while(itr3.hasNext()){
            System.out.println(itr3.next());
        }



        //hm.keySet()



    }

    public static void method1(ArrayList<String> list) {
        list.add("World");
    }
}
