/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comp258.collections;

/**
 * A linked list that stores generic items.
 *
 * @author antoi
 * @param <T> The type of data stored in the list
 */
public class GenericList<T extends Comparable<T>> {

    // First item in the linked list
    private GenericListNode<T> items;

    // Current item in the linked list
    private GenericListNode<T> current;

    public GenericList() {
        items = null;
        current = null;
    }

    // Add an item to the list
    public void add(T item) {

        if (items == null) {

            items = new GenericListNode<T>(item);
            current = items;

        } else {

            current.nextNode = new GenericListNode<T>(item);
            current = current.nextNode;
        }
    }

    // Print all items in the list
    public void print() {

        if (items == null) {
            System.out.println("List is empty.");
            return;
        }

        GenericListNode<T> temp = items;

        while (temp != null) {

            System.out.println(temp.getData());
            temp = temp.nextNode;
        }
    }

    // Move current back to the first item
    public void start() {

        current = items;
    }

    // Return the current item
    public T getCurrent() {

        if (current == null) {
            return null;
        }

        return current.getData();
    }

    // Move current to the next node
    public boolean advance() {

        if (current == null) {
            return false;
        }

        if (current.nextNode == null) {
            return false;
        }

        current = current.nextNode;

        return true;
    }

    // Add a new item after current
    public void addAfter(T item) {

        GenericListNode<T> newNode = new GenericListNode<T>(item);

        if (items == null) {

            items = newNode;
            current = items;

        } else if (current == null) {

            current = items;

            while (current.nextNode != null) {
                current = current.nextNode;
            }

            current.nextNode = newNode;
            current = newNode;

        } else {

            newNode.nextNode = current.nextNode;
            current.nextNode = newNode;
        }
    }

    // Add a new item before current
    public void addBefore(T item) {

        GenericListNode<T> newNode = new GenericListNode<T>(item);

        if (items == null) {

            items = newNode;
            current = items;

        } else if (current == null) {

            newNode.nextNode = items;
            items = newNode;
            current = items;

        } else if (current == items) {

            newNode.nextNode = items;
            items = newNode;

        } else {

            // Find the node before current
            GenericListNode<T> previous = items;

            while (previous.nextNode != current) {
                previous = previous.nextNode;
            }

            previous.nextNode = newNode;
            newNode.nextNode = current;
        }
    }

    // Delete the current item
    public void deleteCurrent() {

        if (current == null) {
            return;
        }

        if (current == items) {

            items = current.nextNode;
            current = items;

        } else {

            // Find the node before current
            GenericListNode<T> previous = items;

            while (previous.nextNode != current) {
                previous = previous.nextNode;
            }

            previous.nextNode = current.nextNode;
            current = current.nextNode;
        }
    }

    // Get an item at a specific position
    public T getItemAt(int position) {

        if (position < 0) {
            return null;
        }

        GenericListNode<T> temp = items;
        int index = 0;

        while (temp != null) {

            if (index == position) {
                return temp.getData();
            }

            temp = temp.nextNode;
            index++;
        }

        return null;
    }

    // Find the largest item in the list
    public T getMaximum() {

        if (items == null) {
            return null;
        }

        GenericListNode<T> maxNode = items;
        GenericListNode<T> temp = items.nextNode;

        while (temp != null) {

            // Compare each item with the current maximum
            if (temp.getData().compareTo(maxNode.getData()) > 0) {
                maxNode = temp;
            }

            temp = temp.nextNode;
        }

        // Move current to the largest item
        current = maxNode;

        return maxNode.getData();
    }
}
