package ArraysAndStrings;

public class CheckIfS2RotaionOfS1 {

    public static void main(String[] args) {
        String s1 = "abbbcbcd";
        String s2 = "bcd";

        String s3 = s2 + s2;
        System.out.println("Is rotated:" + isSubString(s1, s2));
    }

    //s1  = a b b b c d
    //s2 =  b c d

    public static boolean isSubString(String s1, String s2) {
        int a = 0, b = 0;
        String temp;
        if (s1.length() < s2.length()) {
            temp = s1;
            s1 = s2;
            s2 = temp;
        }
        while (a < s1.length() && b < s2.length()) {
            if (s1.charAt(a) == s2.charAt(b)) {
                a++;
                b++;

            } else {
                a = a - b + 1;
                b = 0;
            }
        }
        if (b == s2.length()) {
            return true;
        }
        return false;
    }
}
