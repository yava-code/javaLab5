import java.util.Random;
import java.util.Scanner;

public class Lab5_Vistula_Minimal {

    public static void main(String[] args) {

        System.out.println("task 1: array filling");
        int[] arrayTask1 = new int[10];
        for (int i = 0; i < arrayTask1.length; i++) {
            arrayTask1[i] = 9 - i;
        }
        System.out.print("result: ");
        for (int number : arrayTask1) {
            System.out.print(number + " ");
        }
        System.out.println("\n");


        System.out.println("task 2: min/max");
        int[] arrayTask2 = new int[10];
        Random random = new Random();
        for (int i = 0; i < arrayTask2.length; i++) {
            arrayTask2[i] = random.nextInt(100) + 1;
        }
        System.out.print("random array: ");
        for (int number : arrayTask2) {
            System.out.print(number + " ");
        }
        System.out.println();
        int min = arrayTask2[0];
        int max = arrayTask2[0];
        for (int i = 1; i < arrayTask2.length; i++) {
            if (arrayTask2[i] < min) {
                min = arrayTask2[i];
            }
            if (arrayTask2[i] > max) {
                max = arrayTask2[i];
            }
        }
        System.out.println("min: " + min);
        System.out.println("max: " + max);
        System.out.println();


        System.out.println("task 3: 10x10 matrix");
        int[][] matrix = new int[10][10];
        int diagonalSum = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == j) {
                    matrix[i][j] = i;
                    diagonalSum += matrix[i][j];
                } else {
                    matrix[i][j] = 0;
                }
            }
        }
        System.out.println("matrix:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%2d ", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println("diagonal sum: " + diagonalSum);
        System.out.println();


        System.out.println("task 4: string concat");
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter string 1: ");
        String str1 = scanner.nextLine();
        System.out.print("enter string 2: ");
        String str2 = scanner.nextLine();

        String concat1_2 = str1.concat(str2);
        String concat2_1 = str2.concat(str1);
        System.out.println("str1 + str2: " + concat1_2);
        System.out.println("str2 + str1: " + concat2_1);

        boolean areEqual = concat1_2.equals(concat2_1);
        System.out.println("results equal: " + areEqual);
        if (areEqual) {
            System.out.println("results are identical.");
        } else {
            System.out.println("results are not equal.");
        }
        System.out.println();


        System.out.println("task 5: palindrome check");
        System.out.print("enter word: ");
        String word = scanner.nextLine();
        String lowerCaseWord = word.toLowerCase();
        boolean isPalindrome = true;
        int length = lowerCaseWord.length();

        for (int i = 0; i < length / 2; i++) {
            if (lowerCaseWord.charAt(i) != lowerCaseWord.charAt(length - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("word '" + word + "' is a palindrome.");
        } else {
            System.out.println("word '" + word + "' is not a palindrome.");
        }

        scanner.close();
    }
}