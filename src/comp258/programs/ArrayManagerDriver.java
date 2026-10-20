/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comp258.programs;

import comp258.framework.ConsoleProgram;
import comp258.collections.ArrayManager;
import comp258.exceptions.NoItemsException;
import comp258.exceptions.OutOfBoundsException;

/**
 *
 * @author antoi
 */
public class ArrayManagerDriver extends ConsoleProgram {

    private ArrayManager manager;

    @Override
    public void startProgram() {

        // Begin with an ArrayManager containing 9 integers
        int[] values = {10, 20, 30, 40, 50, 60, 70, 80, 90};

        manager = new ArrayManager(values);
    }

    @Override
    public int showMenu() {

        System.out.println();
        System.out.println("1. Display number of items");
        System.out.println("2. Display all items");
        System.out.println("3. Add an item");
        System.out.println("4. Add an item at a position");
        System.out.println("5. Remove an item");
        System.out.println("0. Exit");

        return readInt("Enter choice: ");
    }

    @Override
    public void executeAction(int choice) {

        try {

            switch (choice) {

                case 1:
                    System.out.println("Item count: " + manager.size());
                    break;

                case 2:
                    manager.print();
                    break;

                case 3:
                    int item = readInt("Enter item: ");

                    manager.add(item);
                    break;

                case 4:
                    int newItem = readInt("Enter item: ");

                    int position = readInt("Enter position: ");

                    manager.addAt(newItem, position);
                    break;

                case 5:
                    int removePosition = readInt("Enter position: ");

                    manager.remove(removePosition);
                    break;

                default:
                    System.out.println("Invalid choice.");
                    break;
            }

        } catch (NoItemsException e) {

            System.out.println(e.getMessage());

        } catch (OutOfBoundsException e) {

            System.out.println(e.getMessage());
        }
    }

    @Override
    public void endProgram() {

        System.out.println("Array Manager ended.");
    }
}
