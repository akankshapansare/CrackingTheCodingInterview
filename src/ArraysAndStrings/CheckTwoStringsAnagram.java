package ArraysAndStrings;

import java.util.HashMap;
import java.util.Scanner;

public class CheckTwoStringsAnagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first string");
        String input1 = scanner.nextLine();
        System.out.println("Enter second string");
        String input2 = scanner.nextLine();
        HashMap<Character, Integer> hm = new HashMap<>();

        if (input1.length() == input2.length()) {
            for (int i = 0; i < input1.length(); i++) {
                if (!hm.containsKey(input1.charAt(i))) {
                    hm.put(input1.charAt(i), 1);
                } else {
                    int x = hm.get(input1.charAt(i));
                    hm.put(input1.charAt(i), x + 1);
                }
            }
            for (int j = 0; j < input2.length(); j++) {
                if (hm.containsKey(input2.charAt(j))) {
                    int y = hm.get(input2.charAt(j));
                    y = y - 1;
                    if (y != 0) {
                        hm.put(input2.charAt(j), y);
                    } else {
                        hm.remove(input2.charAt(j));
                    }
                } else {
                    System.out.println("Given strings are not anagram");
                    return;
                }
            }
            System.out.println("Given strings are anagram");
        } else {
            System.out.println("Given strings are not anagram");
        }

    }
}
