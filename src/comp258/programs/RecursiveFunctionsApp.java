/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comp258.programs;

/**
 * Provides recursive methods for calculations and text processing.
 * 
 * @author antoi
 */
public class RecursiveFunctionsApp {

    /**
     * Calculates the factorial of a non-negative integer.
     *
     * @param n the number, from 0 to 12
     * @return the factorial of n
     */
    public int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    /**
     * Calculates a base raised to a non-negative exponent.
     *
     * @param base the number to multiply
     * @param exponent the non-negative exponent
     * @return base raised to exponent
     */
    public int calculatePower(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else {
            return base * calculatePower(base, exponent - 1);
        }
    }

    /**
     * Determines whether a word is a palindrome.
     *
     * @param word the word to check
     * @return true if the word is a palindrome; otherwise false
     */
    public boolean isPalindrome(String word) {
        return isPalindrome(word, 0, word.length() - 1);
    }

    /**
     * Recursively compares characters from both ends of a word.
     *
     * @param word the word to check
     * @param start the first position to compare
     * @param end the last position to compare
     * @return true if the specified section is a palindrome
     */
    public boolean isPalindrome(String word, int start, int end) {
        if (start >= end) {
            return true;
        } else if (word.charAt(start) != word.charAt(end)) {
            return false;
        } else {
            return isPalindrome(word, start + 1, end - 1);
        }
    }

    /**
     * Calculates the sum of the digits in a non-negative integer.
     *
     * @param number the non-negative integer
     * @return the sum of its digits
     */
    public int digitSum(int number) {
        if (number < 10) {
            return number;
        } else {
            return number % 10 + digitSum(number / 10);
        }
    }

    /**
     * Starts the Indent-o-tron output at call number 1.
     *
     * @param maxNum the number of recursive levels to print
     */
    public void indentoTron(int maxNum) {
        indentoTron(1, maxNum);
    }

    /**
     * Prints indented messages before and after a recursive call.
     *
     * @param currentNum the current call number
     * @param maxNum the maximum call number
     */
    public void indentoTron(int currentNum, int maxNum) {
        if (currentNum > maxNum) {
            return;
        }

        String indentation = "";

        // Add three spaces for each level after the first.
        for (int i = 1; i < currentNum; i++) {
            indentation += "   ";
        }

        System.out.println(indentation
                + "This was written by call number " + currentNum + ".");

        indentoTron(currentNum + 1, maxNum);

        // This message prints as the recursive calls finish.
        System.out.println(indentation
                + "This ALSO written by call number " + currentNum + ".");
    }
}
