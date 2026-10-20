/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comp258.programs;

import comp258.framework.ConsoleProgram;

/**
 *
 * @author antoi
 */
public class LabLauncher extends ConsoleProgram {

    // Stores the program selected by the user
    private ConsoleProgram currentProgram;

    @Override
    public void startProgram() {

        System.out.println("=== COMP 258 Lab Launcher ===");

    }

    @Override
    public int showMenu() {

        System.out.println();
        System.out.println("1. Random Number Program");
        System.out.println("2. Array Manager");
        System.out.println("3. Linked List Program");
        System.out.println("4. Generic List App");
        System.out.println("0. Exit");

        return readInt("Enter choice: ");
    }

    @Override
    public void executeAction(int choice) {

        switch (choice) {

            case 1:
                currentProgram = new RandomNumberProgram();
                break;

            case 2:
                currentProgram = new ArrayManagerDriver();
                break;

            case 3:
                currentProgram = new LinkedListProgram();
                break;

            case 4:
                currentProgram = new ComparableWidgetProgram();
                break;

            default:
                System.out.println("Invalid choice.");
                return;
        }

        // Run the selected program
        currentProgram.run();
    }
}
