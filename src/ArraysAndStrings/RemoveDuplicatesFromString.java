package ArraysAndStrings;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicatesFromString {

    public static void main(String[] args) {
        LinkedHashSet<Character> hs = new LinkedHashSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String input = scanner.nextLine();
        for (int i = 0; i < input.length(); i++) {
            hs.add(input.charAt(i));
        }

        System.out.print("String after removing duplicate characters" + hs.toString());

    }
}
