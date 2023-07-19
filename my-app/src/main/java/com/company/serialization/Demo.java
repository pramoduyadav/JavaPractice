package com.company.serialization;

// For Backward compatibility please use serialVersionUID and kepp it same even if you are adding new fields to the class.

// Java code for serialization and deserialization
// of a Java object
import java.io.*;

class Demo implements java.io.Serializable
{
    public int a;
    public String b;

    private static final long serialVersionUID = 1L;
    public String c;

    // Default constructor
    public Demo(int a, String b,String c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

//    public Demo(int a, String b)
//    {
//        this.a = a;
//        this.b = b;
//    }

}

class Test
{
    public static void main(String[] args)
    {
          String filename = "file.ser";
       Demo object = new Demo(2, "geeksforgeeks","pramod");
//
//
//        // Serialization
        try
        {
            //Saving of object in a file
            FileOutputStream file = new FileOutputStream("pramod.ser");
            ObjectOutputStream out = new ObjectOutputStream(file);

            // Method for serialization of object
            out.writeObject(object);

            out.close();
            file.close();

            System.out.println("Object has been serialized");

        }

        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }


        Demo object1 = null;

        // Deserialization
        try
        {
            // Reading the object from a file
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);

            // Method for deserialization of object
            object1 = (Demo)in.readObject();

            in.close();
            file.close();

            System.out.println("Object has been deserialized ");
            System.out.println("a = " + object1.a);
            System.out.println("b = " + object1.b);
            System.out.println("c = " + object1.c);
        }

        catch(IOException ex)
        {
            System.out.println( ex.getMessage());
        }

        catch(ClassNotFoundException ex)
        {
            System.out.println("ClassNotFoundException is caught");
        }


        Demo object2 = null;

        // Deserialization
        try
        {
            // Reading the object from a file
            FileInputStream file = new FileInputStream("pramod.ser");
            ObjectInputStream in = new ObjectInputStream(file);

            // Method for deserialization of object
            object2 = (Demo)in.readObject();

            in.close();
            file.close();

            System.out.println("Object has been deserialized ");
            System.out.println("a = " + object2.a);
            System.out.println("b = " + object2.b);
            System.out.println("c = " + object2.c);
        }

        catch(IOException ex)
        {
            System.out.println( ex.getMessage());
        }

        catch(ClassNotFoundException ex)
        {
            System.out.println("ClassNotFoundException is caught");
        }

    }
}
