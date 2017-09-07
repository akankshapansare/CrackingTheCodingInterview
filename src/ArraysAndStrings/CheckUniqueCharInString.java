package ArraysAndStrings;

import java.util.Scanner;

public class CheckUniqueCharInString {

    public static void main(String[] args) {
        boolean[] set = new boolean[256];
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        for (int i = 0; i < set.length; i++) {
            int ascii = input.charAt(i);
            if (set[ascii] == true) {
                System.out.println("Given string does not contain unique characters");
                return;
            } else {
                set[ascii] = true;
            }
        }
        System.out.println("Given string contains unique characters");
    }
}
