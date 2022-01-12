package day16_ForLoopStringPractice;

public class DigitsLettersSpecialChars {

    public static void main(String[] args) {

        String str = "Cydeo12345School!@#$%WoodenSpoon";

        String digits = ""; // 12345
        String letters = ""; // CydeoWoodenSpoon
        String specialChars = ""; // !@#$%

        for (int i = 0; i < str.length(); i++) { // i: index numbers of str (0 ~ last index)

            char ch = str.charAt(i); // ch: every single character that we have in the str

            if (ch >= '0' && ch <= '9'){ // if the character is between '0' to '9' then it is a digit
                digits += ch;
            } else if(ch >= 'A' && ch <= 'Z'){ // if the character is between 'A' to 'B' then it is a letter
                letters += ch;
            } else if (ch >= 'a' && ch <= 'z') { // if the character is between 'a' to 'b' then it is a letter
                letters += ch;
            } else { // if the character is neither a digit nor letter, then it is a special character
                if (ch != ' ') { // if the special character is not a space
                    specialChars += ch;
                }
            }

        }

        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specialChars = " + specialChars);

    }
}
