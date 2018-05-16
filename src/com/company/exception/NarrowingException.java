package com.company.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class NarrowingException extends ReadFile{

    @Override
    public void readFile() throws FileNotFoundException{
        System.out.println("File not found Exception");
    }

    public static void main(String[] args) {
        NarrowingException ne = new NarrowingException();
        try {
            ne.readFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class ReadFile {

    public void readFile() throws IOException {
        System.out.println("IO Exception");
    }
}
