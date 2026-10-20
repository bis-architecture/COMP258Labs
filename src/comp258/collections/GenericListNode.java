/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comp258.collections;

/**
 * A node that stores a generic item.
 * 
 * @author antoi
 * @param <T> The type of data stored in the node
 */
public class GenericListNode<T extends Comparable<T>> {

    // Stores the data in the node
    private T data;

    // Points to the next node in the list
    public GenericListNode<T> nextNode;

    // Creates a new node with the given item
    public GenericListNode(T item) {
        data = item;
    }

    // Returns the data stored in the node
    public T getData() {
        return data;
    }

    // Updates the data stored in the node
    public void setData(T item) {
        data = item;
    }
}
