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
        System.out.println("1. Manage data with ArrayManager");
        System.out.println("2. Manage data with LinkedList");
        System.out.println("3. Manage data with GenericLinkedList");
        System.out.println("4. Showcase Recursive Functions");
        System.out.println("5. Exit");

        return readInt("Enter choice: ");
    }

    @Override
    public void executeAction(int choice) {

        switch (choice) {

            case 1:
                currentProgram = new ArrayManagerDriver();
                break;

            case 2:
                currentProgram = new LinkedListProgram();
                break;

            case 3:
                currentProgram = new ComparableWidgetProgram();
                break;

            case 4:
                currentProgram = new RecursiveFunctionsProgram();
                break;

            default:
                System.out.println("Invalid choice.");
                return;
        }

        // Run the selected program
        currentProgram.run();
    }

    // Use option 5 to exit the launcher
    @Override
    public int getQuitOption() {

        return 5;
    }
}
