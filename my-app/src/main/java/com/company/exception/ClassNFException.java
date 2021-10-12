package com.company.exception;

public class ClassNFException {

    public static void main(String args[]) {
        try
        {
            Class.forName("GeeksForGeeks");
        }
        catch (ClassNotFoundException ex)
        {
            ex.printStackTrace();
        }
    }
}