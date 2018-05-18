package com.company.annotation;

import java.lang.annotation.Annotation;

@Annotation1(play = 5)
public class practice1 {

    int play1;

    public String hi() {
        return "";
    }

    public static void main(String[] args) throws NoSuchFieldException {
        practice1 p =new practice1();
        Annotation[] a = p.getClass().getAnnotations();
        for(Annotation aq1 : a) {
            System.out.println(aq1.annotationType().getField("play"));
        }

    }
}
