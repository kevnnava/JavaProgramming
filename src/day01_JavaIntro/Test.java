package day01_JavaIntro;

import day24_CustomMethod_Return.ReturnMethodIntro;
import day24_CustomMethod_Return.ReturnMethodPractice4;
import utilities.StringUtility;

public class Test {

    public static void main(String[] args) {

        String str1 = "aaaaaaaabbbbbbbbbbbbbbbbbbbb";

        str1 = ReturnMethodPractice4.removeDuplicates(str1);

        System.out.println(str1);

        String name = "Java Programming";

        String reversedName = ReturnMethodIntro.reverse(name);

        System.out.println(reversedName);

        System.out.println("--------------------------------------");

        String str = "Wooden Spoon";

        StringUtility.printEachChar(str);

    }
}

// how to call another class from a different class
