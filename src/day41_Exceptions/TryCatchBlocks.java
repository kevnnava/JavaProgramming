package day41_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBlocks {

    public static void main(String[] args) {

        System.out.println("Test 1 Started");

        try {

            System.out.println(9 / 0);

            System.out.println("Try Block");

        }catch (ArithmeticException e){

            System.out.println("Catch Block");

            System.out.println("Arithmetic Exception has occurred");

        }


        System.out.println("Test Completed");

        System.out.println("--------------------------");

        System.out.println("Test 2 Started");

        int[] numbers = {1, 2, 3, 4, 5};

        try{

            System.out.println(numbers[200]);

            System.out.println("Try Block");

        }catch (RuntimeException e){

            e.printStackTrace();

            // System.out.println(e.getMessage() );

        }


        System.out.println("Test 2 Completed");

        System.out.println("--------------------------");

        System.out.println("Test 3 Started");

        try {
            System.out.println("Cydeo".substring(2, 0) );
        }catch (RuntimeException e){
            e.printStackTrace();
        }

        System.out.println("Test 3 Started");

        System.out.println("--------------------------");

        System.out.println("Hello");


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Cydeo");

        System.out.println("--------------------------");

        try {
            FileInputStream file = new FileInputStream("File Path");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
