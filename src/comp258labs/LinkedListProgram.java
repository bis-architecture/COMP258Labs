/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comp258labs;

/**
 *
 * @author antoi
 */
public class LinkedListProgram extends ConsoleProgram {

    private LinkedList list;

    @Override
    public void startProgram() {

        System.out.println("=== Linked List Manager ===");

        list = new LinkedList();
    }

    @Override
    public int showMenu() {

        System.out.println();
        System.out.println("1. Add Before");
        System.out.println("2. Add After");
        System.out.println("3. Print");
        System.out.println("4. Get Current");
        System.out.println("5. Get Item At");
        System.out.println("6. Delete Current");
        System.out.println("7. Advance");
        System.out.println("8. Start");
        System.out.println("9. Run Test");
        System.out.println("0. Exit Program");

        return readInt("Enter choice: ");
    }

    @Override
    public void executeAction(int choice) {

        switch (choice) {

            case 1:
                int beforeItem = readInt("Enter item: ");
                list.addBefore(beforeItem);
                break;

            case 2:
                int afterItem = readInt("Enter item: ");
                list.addAfter(afterItem);
                break;

            case 3:
                list.print();
                break;

            case 4:
                Object currentItem = list.getCurrent();

                if (currentItem == null) {
                    System.out.println("There is no current item.");
                } else {
                    System.out.println("Current item: " + currentItem);
                }

                break;

            case 5:
                int position = readInt("Enter position: ");

                Object item = list.getItemAt(position);

                if (item == null) {
                    System.out.println("Invalid position.");
                } else {
                    System.out.println("Item: " + item);
                }

                break;

            case 6:
                list.deleteCurrent();
                break;

            case 7:
                boolean moved = list.advance();

                if (moved) {
                    System.out.println("Advanced to next item.");
                } else {
                    System.out.println("Cannot advance.");
                }

                break;

            case 8:
                list.start();
                System.out.println("Current moved to start.");
                break;

            case 9:
                runLinkedListTest();
                break;

            default:
                System.out.println("Invalid choice.");
                break;
        }
    }

    public void runLinkedListTest() {

        LinkedList testList = new LinkedList();

        testList.add(5);
        testList.add(6);
        testList.add(7);
        testList.add(8);
        testList.add(9);
        testList.add(10);
        testList.add(11);
        testList.add(12);

        testList.print();
    }

    public static void main(String[] args) {

        LinkedListProgram program = new LinkedListProgram();
        program.run();
    }
}
