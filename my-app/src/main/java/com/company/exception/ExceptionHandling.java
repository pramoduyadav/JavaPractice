package com.company.exception;

import java.io.IOException;

public class ExceptionHandling
{
    public static void main(String[] args)
    {

        try {
            int i = 5/0;
        } catch (ArithmeticException ae) {
            System.out.println("exce");
        }
        catch(Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
//        try
//        {
//            int i = Integer.parseInt("abc");   //This statement throws NumberFormatException
//        }
//
//        catch (Exception e) {
//
//        }

//        catch(NumberFormatException | Exception   ex)
//        {
//            System.out.println("This block handles all exception types");
//        }
//
//        catch(NumberFormatException ex)
//        {
//            //Compile time error
//            //This block becomes unreachable as
//            //exception is already handled by above catch block
//        }
    }
}