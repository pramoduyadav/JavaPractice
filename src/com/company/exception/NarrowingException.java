package com.company.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

//
//1. If parent method doesn't throw any exception then child method may throw any unchecked exception or no exception.
//2. If parent method throws unchecked exception then child method may throw any unchecked exception or no exception.
//3. If parent method throws checked exception then child method may throw same or its subclass' checked exception, any unchecked exception or no exception.
//https://www.javatpoint.com/exception-handling-with-method-overriding

public class NarrowingException extends ReadFile{

    @Override
    public void readFile() throws ArithmeticException {
        System.out.println("------------- tion");
    }

    public static void main(String[] args) {
        NarrowingException ne = new NarrowingException();
        try {
            ne.readFile();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }
}

class ReadFile {

    public void readFile() throws ArithmeticException  {
        System.out.println("IO Exception");
    }
}
