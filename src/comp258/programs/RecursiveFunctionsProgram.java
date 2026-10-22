/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comp258.programs;

import comp258.collections.GenericList;
import comp258.framework.ConsoleProgram;

/**
 *
 * @author antoi
 */
public class RecursiveFunctionsProgram extends ConsoleProgram {

    // Stores the recursive functions
    private RecursiveFunctionsApp functions;

    // Stores the numbers used to test recursive list printing
    private GenericList<Integer> numbers;

    // Create the recursive functions object and populate the test list
    @Override
    public void startProgram() {

        functions = new RecursiveFunctionsApp();
        numbers = new GenericList<Integer>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println("=== Recursive Functions ===");
    }

    // Display the menu and return the user's choice
    @Override
    public int showMenu() {

        System.out.println();
        System.out.println("1. Calculate factorial");
        System.out.println("2. Calculate powers");
        System.out.println("3. Check if a word is a palindrome");
        System.out.println("4. Print number's digit sum");
        System.out.println("5. Run Indent-o-tron");
        System.out.println("6. Print linked list with recursion");
        System.out.println("7. Print linked list backwards with recursion");
        System.out.println("8. Exit program");

        return readInt("Enter choice: ");
    }

    // Run the action selected by the user
    @Override
    public void executeAction(int choice) {

        switch (choice) {

            case 1:
                int number = readInt("Enter a number from 0 to 12: ");

                // Keep the factorial result within the int range
                if (number < 0 || number > 12) {
                    System.out.println("Please enter a number from 0 to 12.");
                } else {
                    System.out.println("Factorial: "
                            + functions.factorial(number));
                }
                break;

            case 2:
                int base = readInt("Enter the base: ");
                int exponent = readInt("Enter a non-negative exponent: ");

                // Check that the exponent is supported by the method
                if (exponent < 0) {
                    System.out.println("The exponent must be non-negative.");
                } else {
                    System.out.println("Result: "
                            + functions.calculatePower(base, exponent));
                }
                break;

            case 3:
                String word = readString("Enter a word: ");

                // Call the palindrome wrapper and display the result
                if (functions.isPalindrome(word)) {
                    System.out.println(word + " is a palindrome.");
                } else {
                    System.out.println(word + " is not a palindrome.");
                }
                break;

            case 4:
                int digitNumber = readInt("Enter a non-negative number: ");

                // Check that the number is supported by the method
                if (digitNumber < 0) {
                    System.out.println("The number must be non-negative.");
                } else {
                    System.out.println("Digit sum: "
                            + functions.digitSum(digitNumber));
                }
                break;

            case 5:
                int maxNum = readInt("Enter the maximum call number: ");

                // Start Indent-o-tron only when the maximum is positive
                if (maxNum < 1) {
                    System.out.println("Please enter a positive number.");
                } else {
                    functions.indentoTron(maxNum);
                }
                break;

            case 6:
                // Print the test list in forward order using recursion
                numbers.printRecursive();
                break;

            case 7:
                // Print the test list in reverse order using recursion
                numbers.printBackwards();
                break;

            default:
                System.out.println("Invalid choice.");
                break;
        }
    }

    // Use option 8 to exit this program
    @Override
    public int getQuitOption() {

        return 8;
    }

    // Display a message when returning to the launcher
    @Override
    public void endProgram() {

        System.out.println("Returning to the lab launcher.");
    }
}
