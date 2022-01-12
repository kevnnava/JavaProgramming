package day05_Concatenation;

public class ShippingAddress {

    public static void main(String[] args) {


        String name = "Kevin Nava",
             buildingNumber = "7B",
             streetName = "9455 Skillman St",
             city = "Dallas",
             state = "TX",
             zipCode = "75243";

        /*
        String name = "Barlos Teller";
        String buildingNumber = "123B";
        String streetName = "932 Skillman St";
        String city = "Dallas";
        String state = "Tx";
        String zipCode = "75242";
        */

       //System.out.println(name + "\n" + buildingNumber + " " + streetName + "\n" + city + ", " + state + " " + zipCode);


        String address = name + "\n" + buildingNumber + " " + streetName + "\n" + city + ", " + state + " " + zipCode;

        System.out.println(address);

        String name1 = "Kevin";
        String name2 = "Amir";
        String bothNames = name1 + " " + name2;
        System.out.println("bothNames = " + bothNames);


    }
}

/*
Create a class called ShippingAddress.java
Declare the following variables:
name
buildingNumber
streetName
city
state
zipCode

Use concatenation to print the full shipping address

Kevin Nava
7B 9455 Skillman St
Dallas, TX 75243
 */