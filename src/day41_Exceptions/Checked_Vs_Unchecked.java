package day41_Exceptions;

import day39_Recap.cydeoTask.Student;

import java.io.FileInputStream;

public class Checked_Vs_Unchecked {

    public static void main(String[] args) {

        // unchecked exception:

        int a = 10;
        int b = 0;

        // System.out.println(a / b);
        // System.out.println("Wooden Spoon");


        char[] characters = {'A', 'B', 'C'};
        //                    0,   1,   2

        // System.out.println(characters[99]);

        Student student = null;

        // System.out.println(student.getName() );
        // student.study();

        String str = "Wooden Spoon";

        // str = null;

        // System.out.println(str.toUpperCase() );

        String str2 = ""; // object != null
        System.out.println(str2.isEmpty() );


        // Checked Exception:

        System.out.println("Hello");

        // Thread.sleep(3000); // checked exception

        System.out.println("Cydeo");

        // FileInputStream file = new FileInputStream("path of the file");

        System.out.println("java".charAt(20000)); // unchecked exception



    }

}