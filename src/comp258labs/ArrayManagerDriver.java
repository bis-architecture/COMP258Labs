/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comp258labs;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author antoi
 */
public class ArrayManagerDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        // 12, 7, 25, 4, 18
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(12);
        numbers.add(7);
        numbers.add(25);
        numbers.add(4);
        numbers.add(18);

        //1. Display the number of items in the ArrayList.
        System.out.println("Item count: " + numbers.size());

        //2. Use a loop to display all of the items.
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(i + ": " + numbers.get(i) + ", ");
        }
        //3. Add the value 30 to the end of the list.
        numbers.add(30);

        //4. Insert the value 15 at index 2.
        numbers.add(2, 15);

        //5. Remove the iteam at index 4.
        numbers.remove(4);

        //6. Display the item stored at index 3.
        System.out.println("Item [3]: " + numbers.get(3));

        //7. Change the item at index 0 to 100.
        numbers.set(0, 100);
        
        //8. Display the completed ArrayList.
        System.out.println("ArrayList: " + numbers);

        // Bonus. Create a new ArrayList with Strings, not Integers 
        ArrayList<String> names = new ArrayList<String>();
        names.add("John");
        names.add(0, "Jane");
        System.out.println(names);
         */

        //ArrayManager Driver
        Scanner input = new Scanner(System.in);

        // Begin with an ArrayManager containing 9 integers
        int[] values = {10, 20, 30, 40, 50, 60, 70, 80, 90};

        ArrayManager manager = new ArrayManager(values);

        int choice;

        do {

            System.out.println();
            System.out.println("1. Display number of items");
            System.out.println("2. Display all items");
            System.out.println("3. Add an item");
            System.out.println("4. Add an item at a position");
            System.out.println("5. Remove an item");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            choice = input.nextInt();

            try {

                switch (choice) {

                    case 1:
                        System.out.println("Item count: " + manager.size());
                        break;

                    case 2:
                        manager.print();
                        break;

                    case 3:
                        System.out.print("Enter item: ");
                        int item = input.nextInt();

                        manager.add(item);
                        break;

                    case 4:
                        System.out.print("Enter item: ");
                        int newItem = input.nextInt();

                        System.out.print("Enter position: ");
                        int position = input.nextInt();

                        manager.addAt(newItem, position);
                        break;

                    case 5:
                        System.out.print("Enter position: ");
                        int removePosition = input.nextInt();

                        manager.remove(removePosition);
                        break;

                    case 6:
                        System.out.println("Program ended.");
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

        } while (choice != 6);
    }

}
