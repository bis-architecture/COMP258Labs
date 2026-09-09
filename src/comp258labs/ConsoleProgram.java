/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comp258labs;

import java.util.Scanner;

/**
 *
 * @author antoi
 */
public abstract class ConsoleProgram {

    protected Scanner input = new Scanner(System.in);

    //Constant
    protected static final int QUIT_OPTION = 0;

    /**
     * Template method that controls the overall program. Starts the program,
     * displays the menu until the user quits, and then ends the program.
     */
    public final void run() {

        startProgram();

        int choice;

        do {

            choice = showMenu();

            if (choice != QUIT_OPTION) {

                executeAction(choice);
            }

        } while (choice != QUIT_OPTION);

        endProgram();
    }

    /**
     * Displays the menu and returns the user's choice.
     *
     * @return the menu option selected by the user
     */
    public abstract int showMenu();

    /**
     * Executes the action that matches the user's menu choice.
     *
     * @param choice the menu option selected by the user
     */
    public abstract void executeAction(int choice);

    /**
     * Hook that runs when the program starts.
     */
    public void startProgram() {

        System.out.println("Program starting...");
    }

    /**
     * Hook that runs when the program ends.
     */
    public void endProgram() {

        System.out.println("Program ended.");
    }

    /**
     * Returns the quit option used by the framework.
     *
     * @return the quit option
     */
    public int getQuitOption() {

        return QUIT_OPTION;
    }

    /**
     * Reads a whole number from the user. Keeps asking until a valid integer is
     * entered.
     *
     * @param prompt the message displayed to the user
     * @return the integer entered by the user
     */
    protected int readInt(String prompt) {

        System.out.print(prompt);

        while (!input.hasNextInt()) {

            System.out.println("Please enter a whole number.");

            input.nextLine();

            System.out.print(prompt);
        }

        int value = input.nextInt();

        input.nextLine();

        return value;
    }

    /**
     * Reads a decimal number from the user. Keeps asking until a valid number
     * is entered.
     *
     * @param prompt the message displayed to the user
     * @return the double entered by the user
     */
    protected double readDouble(String prompt) {

        System.out.print(prompt);

        while (!input.hasNextDouble()) {

            System.out.println("Please enter a number.");

            input.nextLine();

            System.out.print(prompt);
        }

        double value = input.nextDouble();

        input.nextLine();

        return value;
    }

    /**
     * Reads a String from the user.
     *
     * @param prompt the message displayed to the user
     * @return the String entered by the user
     */
    protected String readString(String prompt) {

        System.out.print(prompt);

        String value = input.nextLine();

        return value;
    }
}
