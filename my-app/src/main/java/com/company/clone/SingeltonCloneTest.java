package com.company.clone;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public final class SingeltonCloneTest implements Cloneable{
    /**
     * @param args
     * @return
     */
    private static SingeltonCloneTest instance = null;

    public String name = null;
    private SingeltonCloneTest(String name) {
        this.name = name;
        System.out.println("name::"+name);
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getName() {
        return this.name;
    }

    public static SingeltonCloneTest getInstance(String name) {

        if (instance == null) {
            synchronized(SingeltonCloneTest.class) {
                if(instance == null) {
                    instance = new SingeltonCloneTest(name);
                }
            }
            return instance;
        }
        return instance;
    }

//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//
//        // TODO Auto-generated method stub
//        /*
//         * Here forcibly throws the exception for preventing to be cloned
//         */
//        throw new CloneNotSupportedException();
//        // return super.clone();
//    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SingeltonCloneTest test1 = SingeltonCloneTest.getInstance("Pramod");
        System.out.println(test1.name);
        List<String> names = Arrays.asList("Angela", "Aaron", "Bob", "Claire", "David");

        List<String> namesWithA = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println(namesWithA);

        try {
            SingeltonCloneTest test2 = (SingeltonCloneTest) test1.clone();
            test2.setName("Yadav");

            System.out.println(test1.getName() == test2.getName());
           // System.out.println(test2.name);
        } catch (CloneNotSupportedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


}
