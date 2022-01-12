package day06_PrimitiveTypeCastings;

import javax.lang.model.SourceVersion;
import java.sql.SQLOutput;

public class Birthday {

    public static void main(String[] args) {

        String name = "John";
        int birthDay = 25; // 25
        String birthMonth = "April"; // April
        int birthYear = 1995; // 2001


       // John was born on month/day/year.
        System.out.println(name + " was born on " + birthMonth + "/" + birthDay + "/" + birthYear + ".");

        System.out.println("------------------------------------------");

        // My favorite book is "bookName".
        String bookName = "Harry Potter";

        System.out.println("My favorite book is \"" + bookName + "\".");

        /*
        \n <-- new line
        \t <-- tab
        \" <-- quotes
        \\ <-- backslash

         */


    }
}
/*
1. Create a class called BirthDay and create the following variable
             name, birthDay(int), birthMonth(String), birthYear(int)

             use concatenation to display the birthday of the person

                 if  name = "John"
                     birthDay = 25
                     birthMonth = "April"
                     birthYear = 1995;

                 output:
                     John was born on April/25/1995.
 */