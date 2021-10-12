package com.company.exception;

import java.io.*;

class CheckedException {
    public static void main(String args[])
    {
        FileInputStream fis = null;
        /*This constructor FileInputStream(File filename)
         * throws FileNotFoundException which is a checked
         * exception
         */
        try {
            fis = new FileInputStream("B:/myfile.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int k = 0;

        /* Method read() of FileInputStream class also throws
         * a checked exception: IOException
         */
        while(true)
        {
            try {
                if (!(( k = fis.read() ) != -1)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.print((char)k);
        }

        /*The method close() closes the file input stream
         * It throws IOException*/
        try {
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}