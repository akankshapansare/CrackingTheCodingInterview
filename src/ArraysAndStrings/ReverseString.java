package ArraysAndStrings;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String input = scanner.nextLine();
        int size = input.length();
        char[] output = new char[size + 1];

        for (int i = 0; i < size; i++) {
            output[i] = input.charAt(size - (i + 1));
        }

        output[size] = '\0';

        System.out.println("Reverse String is: " + String.valueOf(output));
    }
}
