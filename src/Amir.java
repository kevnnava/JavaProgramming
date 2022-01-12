import org.w3c.dom.ls.LSOutput;
import utilities.ArraysUtility;

import java.util.Arrays;

public class Amir {

    public static void main(String[] args) {


        String[] a1 = {"Amir"};
        String[] a2 = {"why u so fruity?"};

        String[] result = merge(a1, a2);

        System.out.println(Arrays.toString(result));
    }

        // merge the given two arrays and returns the new array
        public static int[] merge(int[] arr1, int[] arr2){
            int[] result = {};

            for (int each : arr1) {
                result = ArraysUtility.addElement(result, each);
            }

            for (int each : arr2) {
                result = ArraysUtility.addElement(result, each);
            }

            return result;
        }

        // merge the given two arrays and returns the new array
        public static double[] merge(double[] arr1, double[] arr2){
            double[] result = {};

            for (double each : arr1) {
                result = ArraysUtility.addElement(result, each);
            }

            for (double each : arr2) {
                result = ArraysUtility.addElement(result, each);
            }

            return result;
        }

        // merge the given two arrays and returns the new array
        public static char[] merge(char[] arr1, char[] arr2){
            char[] result = {};

            for (char each : arr1) {
                result = ArraysUtility.addElement(result, each);
            }

            for (char each : arr2) {
                result = ArraysUtility.addElement(result, each);
            }

            return result;
        }

        // merge the given two arrays and returns the new array
        public static String[] merge(String[] arr1, String[] arr2){
            String[] result = {};

            for (String each : arr1) {
                result = ArraysUtility.addElement(result, each);
            }

            for (String each : arr2) {
                result = ArraysUtility.addElement(result, each);
            }

            return result;




        }




    }
