package day05_Concatenation;

public class FullName {

    public static void main(String[] args) {
        String firstName = "Kevin";
        String lastName = "Nava";
        int age = 21;
        String jobTitle = "Senior SDET";
        String companyName = "Apple Inc";
        double salary = 100000.58;


        String fullName = firstName + " " + lastName;

        // Full name of the person is_______

        System.out.println("Full name of the person is " + fullName);

        // ____ is ___ years old
        System.out.println(fullName + " is " + age + " years old");

        // FullName is JobTitle, works at CompanyName, and FullName' salary is Salary
        System.out.println(fullName + " is " + jobTitle + ", works at " + companyName + ", and " + fullName + "'s salary is $" + salary);


    }
}
