package day17_While_DoWhile;

public class FrequencyOfWord2 {

    public static void main(String[] args) {
        String str = "Cat Cat Dog Dog cAT CAT caT";

        int frequency = 0;

        for (int i = 0; i <= str.length() - 3; i++) { // i: 1, 2, 3
            String eachSub = str.substring(i, i + 3);
            // System.out.println(eachSub);

            if (eachSub.equalsIgnoreCase("Cat")) {
                frequency++;
            }
        }

        System.out.println(frequency);

    }
}
