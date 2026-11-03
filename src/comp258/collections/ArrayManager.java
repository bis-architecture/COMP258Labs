/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comp258.collections;

import comp258.exceptions.NoItemsException;
import comp258.exceptions.OutOfBoundsException;

/**
 *
 * @author antoi
 */
public class ArrayManager {

    private int[] items;
    private int count;

    //Constructors
    /**
     * Creates an empty ArrayManager. Set count to 0 and create an items array
     * with a capacity of 10
     */
    public ArrayManager() {
        items = new int[10];
        count = 0;
    }

    /**
     * Creates an empty ArrayManager with an items array of the specified capacity 
     * Set count to 0
     * @param capacity
     */
    public ArrayManager(int capacity) {
        items = new int[capacity];
        count = 0;

    }

    public ArrayManager(int[] values) {
        items = new int[values.length];

        for (int i = 0; i < values.length; i++) {
            items[i] = values[i];
        }

        count = values.length;
    }

    //Methods
    //Returns the number of items currently stored in the ArrayManager 
    public int size() {
        return count;
    }

    //Displays all items currently stored in the ArrayManager
    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(i + ": " + items[i]);
        }
    }

    //Adds n to the end of the items currently stored in the ArrayManager
    public void add(int n) {
        items[count] = n;
        count++;
    }

    //Removes the item at index pos
    public void remove(int pos) throws NoItemsException {

        if (isEmpty()) {
            throw new NoItemsException();
        }

        for (int i = pos; i < count - 1; i++) {
            items[i] = items[i + 1];
        }

        count--;
    }

    //Removes all items that match o
    public void removeAllOccurances(Object o) {

        if (o == null) {
            return;
        }

        for (int i = 0; i < count; i++) {

            if (o.equals(items[i])) {

                //Move the remaining items one position to the left
                for (int j = i; j < count - 1; j++) {
                    items[j] = items[j + 1];
                }

                count--;

                //Check the item that moved into this position
                i--;
            }
        }
    }

    // Adds n at idex position
    public void addAt(int n, int pos) throws OutOfBoundsException {

        if (pos < 0 || pos > count) {
            throw new OutOfBoundsException();
        }

        for (int i = count; i > pos; i--) {
            items[i] = items[i - 1];
        }

        items[pos] = n;
        count++;
    }

    // Returns true if there are no items
    public boolean isEmpty() {
        return count == 0;
    }
}
