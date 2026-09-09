/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comp258labs;
import java.util.Random;    
/**
 *
 * @author antoi
 */
public class RandomNumberProgram extends ConsoleProgram {

    //Array that stores the random numbers
    private int[] numbers;

    @Override
    public void startProgram() {

        System.out.println("=== Random Number Array Manager ===");

        //Create the array with exactly 20 elements
        numbers = new int[20];

        Random random = new Random();

        //Fill the array with random numbers from 1 to 10
        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = random.nextInt(10) + 1;
        }
    }

    @Override
    public int showMenu() {

        System.out.println();
        System.out.println("1. Print Numbers");
        System.out.println("2. Search");
        System.out.println("3. Find and Replace");
        System.out.println(QUIT_OPTION + ". Quit");

        return readInt("Select an option: ");
    }

    @Override
    public void executeAction(int choice) {

        if (choice == 1) {

            printNumbers();

        } else if (choice == 2) {

            searchNumbers();

        } else if (choice == 3) {

            findAndReplace();

        } else {

            System.out.println("Invalid option.");
        }
    }

    private void printNumbers() {

        System.out.println();

        for (int i = 0; i < numbers.length; i++) {

            System.out.println("Position " + (i + 1) + ": " + numbers[i]);
        }
    }

    private int search(int value) {

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] == value) {

                return i;
            }
        }

        return -1;
    }

    private void searchNumbers() {

        int value = readInt("Enter a number to search for: ");

        int position = search(value);

        if (position == -1) {

            System.out.println(value + " was not found.");

        } else {

            System.out.println(value + " was first found at position "
                    + (position + 1));
        }
    }

    private void findAndReplace() {

        int findValue = readInt("Enter a number to find: ");

        int replacementValue = readInt("Enter a replacement value: ");

        int position = search(findValue);

        if (position == -1) {

            System.out.println(findValue + " was not found.");

        } else {

            numbers[position] = replacementValue;

            System.out.println(findValue
                    + " was replaced with "
                    + replacementValue
                    + " at position "
                    + (position + 1));
        }
    }
}
