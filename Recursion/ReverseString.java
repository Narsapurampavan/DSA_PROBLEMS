package Recursion;

public class ReverseString {

    static String reverse(String str) {

        // Base condition
        if (str.isEmpty()) {
            return str;
        }

        // Recursive call
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {

        String str = "Pavan";

        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reverse(str));
    }
}

