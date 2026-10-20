/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comp258.collections;

/**
 *
 * @author antoi
 */
public class Widget implements Comparable<Widget> {

    // Name of the widget
    private String name;

    // Price of the widget
    private double price;

    // Creates a widget with a name and price
    public Widget(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Compares widgets based on their price
    @Override
    public int compareTo(Widget other) {

        if (price > other.price) {
            return 1;
        } else if (price < other.price) {
            return -1;
        } else {
            return 0;
        }
    }

    // Displays the widget's name and price
    @Override
    public String toString() {
        return name + " - $" + price;
    }
}
