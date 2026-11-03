/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comp258.programs;

import comp258.collections.ArrayManager;
import comp258.collections.LinkedList;

/**
 *
 * @author antoi
 */
public class AlgorithmAnalysisTest {

    public static void main(String[] args) {

        //Test the values from the assignment
        int[] values = {1, 3, 4, 5, 3, 4, 3, 4, 1, 2, 5, 6};
        runTest("Assignment example", values, 4, "1, 3, 5, 3, 3, 1, 2, 5, 6");

        //Test matching items beside each other and at both ends
        int[] consecutive = {4, 4, 1, 4, 4, 2, 4, 4};
        runTest("Consecutive matches", consecutive, 4, "1, 2");

        //Test a collection where every item matches
        int[] allMatch = {4, 4, 4, 4};
        runTest("All items match", allMatch, 4, "empty");

        //Test a collection with no matching items
        int[] noMatch = {1, 2, 3};
        runTest("No matches", noMatch, 4, "1, 2, 3");

        //Test an empty collection
        int[] empty = {};
        runTest("Empty collection", empty, 4, "empty");

        //Test a collection with only one item
        int[] single = {4};
        runTest("One matching item", single, 4, "empty");

        //Test integer values larger than 127
        int[] largerValues = {200, 1, 200, 2};
        runTest("Larger values", largerValues, 200, "1, 2");
    }

    //Run the same test on both collections
    public static void runTest(String name, int[] values, int item, String expected) {

        ArrayManager manager = new ArrayManager(values);
        LinkedList list = new LinkedList();

        for (int i = 0; i < values.length; i++) {
            list.add(values[i]);
        }

        System.out.println();
        System.out.println("=== " + name + " ===");
        System.out.println("Expected: " + expected);

        manager.removeAllOccurances(item);
        list.removeAllOccurances(item);

        System.out.println("ArrayManager:");

        if (manager.isEmpty()) {
            System.out.println("Array is empty.");
        } else {
            manager.print();
        }

        System.out.println("Item count: " + manager.size());
        System.out.println("LinkedList:");
        list.print();
    }
}
