/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comp258labs;

import java.util.LinkedList;

/**
 *
 * @author antoi
 */
public class BuiltInLinkedListDemo {

    public static void main(String[] args) {

        LinkedList<Integer> numbers = new LinkedList<Integer>();

        //Starting values
        numbers.add(12);
        numbers.add(7);
        numbers.add(25);
        numbers.add(4);
        numbers.add(18);

        //1. Display number of items
        System.out.println("Size: " + numbers.size());

        //2. Display all items
        System.out.println("Items:");

        for (int n : numbers) {
            System.out.print(n + ", ");
        }

        System.out.println();

        //3. Add 30 to the end
        numbers.add(30);
        System.out.println("After adding 30:");
        System.out.println(numbers);

        //4. Add 15 at index 2
        numbers.add(2, 15);
        System.out.println("After adding 15 at index 2:");
        System.out.println(numbers);

        //5. Remove item at index 4
        numbers.remove(4);
        System.out.println("After removing index 4:");
        System.out.println(numbers);

        //6. Get item at index 3
        System.out.println("Item at index 3: " + numbers.get(3));

        //7. Replace item at index 0
        numbers.set(0, 100);
        System.out.println("After replacing index 0 with 100:");
        System.out.println(numbers);

        //8. Add to front
        numbers.addFirst(50);
        System.out.println("After adding 50 to front:");
        System.out.println(numbers);

        //9. Add to end
        numbers.addLast(60);
        System.out.println("After adding 60 to end:");
        System.out.println(numbers);

        //10. Remove first
        numbers.removeFirst();
        System.out.println("After removing first:");
        System.out.println(numbers);

        //11. Remove last
        numbers.removeLast();
        System.out.println("After removing last:");
        System.out.println(numbers);
    }
}
