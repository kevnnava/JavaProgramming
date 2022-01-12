package day04_Variables;

public class PrimitivesIntro {

    public static void main(String[] args) {

        // age:38 years old

        byte age = 38;

        // weight: 160 pounds
        // byte weight = 160; // 160 is out of byte' range
        // byte num = -129; // -129 is out of byte' range

        short weight = 160; // 160 is within range of short

        // salary: 100000 $
        //short salary = 100000; //100000 is out of short' range

        int salary = 100_000; // int is the preferred data type for integer numbers


        long asset = 3_333_333_333L;


        // tax 0.26
        float tax = 0.26F;

        double PI = 3.14;


        // #
        char ch1 = '#';
        System.out.println("ch1 = " + ch1);

        char ch2 = 35;
        System.out.println("ch2 = " + ch2);

        char ch3 = 45000;
        System.out.println("ch3 = " + ch3);

        char ch4 = 15000;
        System.out.println("ch4 = " + ch4);

        char gender = 'F';

        char grade = 'F';

        char yesNo = 'Y';

        // char ch5 = 'AB';

        boolean isEmployed = true;
        boolean isMarried = false;

        boolean result = 100 > 300;

        System.out.println("isEmployed = " + isEmployed);
        System.out.println("isMarried = " + isMarried);
        System.out.println("result = " + result);


        String name = "Wooden Spoon";
        String city = "Mclean";
        String state = "Virginia";
        String country = "USA";

        System.out.println("name = " + name);
        System.out.println("city = " + city);
        System.out.println("state = " + state);
        System.out.println("country = " + country);

        String first_name = "Kevin";
        int num1 = 100;
        int num2 = 200;

        //int private = 300;

        double salaryAfterTax = 2.5;
        // int salaryAfterTax = 2.5; <- cannot use


        // There are ONLY 8 Primitives in JAVA

    }
}
