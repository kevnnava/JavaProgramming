package day33_Statics;

public class Iphone {

    public static String brand = "Apple"; // use static where everything is the same, such as all iPhones are apple products

    public String model;

    public double price;

    public static String OS = "IOS"; // all apple products use iOS

    public String color; // use instance for when things are different such as not all iPhones are the same color

    public String size; // not all iPhones are the same size

    public static String madeIn = "China";

    public static boolean hasBattery = true;

    public static boolean isTouchScreen = true;

    public static boolean hasFaceTime = true;

    public static void printOperatingSystem(){
        System.out.println(OS);
    }

        /*
     public static void printModelAndPrice(){
        System.out.println(model + " : " + price); // static methods does not accept instances
      }
         */

    public void method1(){
        System.out.println(model+" : "+price);
        System.out.println(OS);
    }


}
