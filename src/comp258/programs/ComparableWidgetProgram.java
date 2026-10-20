/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comp258.programs;

import comp258.framework.ConsoleProgram;
import comp258.collections.GenericList;
import comp258.collections.Widget;

/**
 *
 * @author antoi
 */
public class ComparableWidgetProgram extends ConsoleProgram {

    private GenericList<Widget> widgets;

    @Override
    public void startProgram() {

        System.out.println("=== Generic List Program ===");

        // Start with an empty list
        widgets = new GenericList<Widget>();
    }

    @Override
    public int showMenu() {

        System.out.println();
        System.out.println("1. Add Widget");
        System.out.println("2. Print List");
        System.out.println("3. Get Maximum");
        System.out.println("4. Get Current");
        System.out.println("5. Advance");
        System.out.println("6. Remove Current");
        System.out.println("7. Test Integer and String");
        System.out.println("0. Exit");

        return readInt("Enter choice: ");
    }

    @Override
    public void executeAction(int choice) {

        switch (choice) {

            case 1:
                String name = readString("Enter widget name: ");
                double price = readDouble("Enter widget price: ");

                widgets.addAfter(new Widget(name, price));
                break;

            case 2:
                widgets.print();
                break;

            case 3:
                System.out.println("Maximum: " + widgets.getMaximum());
                break;

            case 4:
                System.out.println("Current: " + widgets.getCurrent());
                break;

            case 5:
                System.out.println("Advanced: " + widgets.advance());
                break;

            case 6:
                widgets.deleteCurrent();
                System.out.println("Remove completed.");
                break;

            case 7:
                testGenericLists();
                break;

            default:
                System.out.println("Invalid choice.");
                break;
        }
    }

    // Test the list using integers and strings
    private void testGenericLists() {

        GenericList<Integer> numbers = new GenericList<Integer>();

        numbers.add(10);
        numbers.add(40);
        numbers.add(25);

        System.out.println("Integer maximum: " + numbers.getMaximum());
        System.out.println("Integer current: " + numbers.getCurrent());

        GenericList<String> names = new GenericList<String>();

        names.add("Apple");
        names.add("Orange");
        names.add("Banana");

        System.out.println("String maximum: " + names.getMaximum());
        System.out.println("String current: " + names.getCurrent());
    }
}
