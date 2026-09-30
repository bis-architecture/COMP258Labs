/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comp258labs;

/**
 *
 * @author antoi
 */
public class LinkedList {

    //First item in the linked list
    private ListNode items;

    //Current item in the linked list
    private ListNode current;

    public LinkedList() {
        items = null;
        current = null;
    }

    //Basic add method from Part 2
    public void add(Object item) {

        //If the list is empty
        if (items == null) {

            items = new ListNode(item);
            current = items;
        } //If the list already has items
        else {

            current.nextNode = new ListNode(item);
            current = current.nextNode;
        }
    }

    //Print all items in the linked list
    public void print() {

        if (items == null) {
            System.out.println("List is empty.");
            return;
        }

        ListNode temp = items;

        while (temp != null) {

            System.out.println(temp.getData());
            temp = temp.nextNode;
        }
    }

    //Move current back to the first item
    public void start() {

        current = items;
    }

    //Return the data stored in current
    public Object getCurrent() {

        if (current == null) {
            return null;
        }

        return current.getData();
    }

    //Move current to the next node
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

    //Add a new item after current
    public void addAfter(Object item) {

        ListNode newNode = new ListNode(item);

        //If the list is empty
        if (items == null) {

            items = newNode;
            current = items;
        } //If the list has items but there is no current item
        else if (current == null) {

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

    //Add a new item before current
    public void addBefore(Object item) {

        ListNode newNode = new ListNode(item);

        //If the list is empty
        if (items == null) {

            items = newNode;
            current = items;
        } //If the list has items but there is no current item
        else if (current == null) {

            newNode.nextNode = items;
            items = newNode;
            current = items;
        } //If current is the first item
        else if (current == items) {

            newNode.nextNode = items;
            items = newNode;
        } else {

            //Find the node before current
            ListNode previous = items;

            while (previous.nextNode != current) {
                previous = previous.nextNode;
            }

            //Connect previous to the new node
            previous.nextNode = newNode;

            //Connect new node to current
            newNode.nextNode = current;
        }
    }

    //Delete the current item
    public void deleteCurrent() {

        //Nothing to delete
        if (current == null) {
            return;
        }

        //Current is the first item
        if (current == items) {

            items = current.nextNode;
            current = items;
        } else {

            //Find the node before current
            ListNode previous = items;

            while (previous.nextNode != current) {

                previous = previous.nextNode;
            }

            //Skip over current
            previous.nextNode = current.nextNode;

            //Make the next item current
            current = current.nextNode;
        }
    }

    //Get an item at a specific position
    public Object getItemAt(int position) {

        if (position < 0) {
            return null;
        }

        ListNode temp = items;
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
}
