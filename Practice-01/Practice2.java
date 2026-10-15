

import java.util.Scanner;

public class Practice2 {
    static boolean isPalindromeIterative(String text) {
        int left = 0;
        int right = text.length() - 1;

        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    static boolean isPalindromeRecursive(String text) {
        return check(text, 0, text.length() - 1);
    }

    static boolean check(String text, int left, int right) {
        if (left >= right) {
            return true;
        }
        if (text.charAt(left) != text.charAt(right)) {
            return false;
        }
        return check(text, left + 1, right - 1);
    }

    static boolean isPalindromeArrayReversal(String text) {
        char[] chars = text.toCharArray();
        String reversed = "";

        for (int i = chars.length - 1; i >= 0; i--) {
            reversed += chars[i];
        }

        return text.equals(reversed);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String text = sc.nextLine();

        System.out.println("Iterative: " +
                (isPalindromeIterative(text) ? "Palindrome" : "Not Palindrome"));

        System.out.println("Recursive: " +
                (isPalindromeRecursive(text) ? "Palindrome" : "Not Palindrome"));

        System.out.println("Array Reversal: " +
                (isPalindromeArrayReversal(text) ? "Palindrome" : "Not Palindrome"));

        sc.close();
    }
}
