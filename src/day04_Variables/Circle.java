package day04_Variables;

public class Circle {

    public static void main(String[] args) {
        // PI, radius, diameter, area, parameter

        double PI = 3.14;
        double radius = 5.5;
        double diameter = radius * 2; // finds diameter by multiplying the radius by 2
        double area = radius * radius * PI; // finds the area by multiplying radius * radius * PI
        double perimeter = diameter * PI; // finds perimeter of the circle by multiplying diameter * PI


        System.out.println("radius = " + radius);
        System.out.println("diameter = " + diameter);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);


    }
}


/*
3. Create a class named Circle, write a program that can calculate the area & perimeter of any given Circle
                    Hints:  PI = 3.14
                            area = radius * radius * PI
                            Perimeter = 2 * radius * PI
 */