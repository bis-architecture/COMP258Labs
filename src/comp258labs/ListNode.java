/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comp258labs;

/**
 *
 * @author antoi
 */
public class ListNode {

    private Object data;
    public ListNode nextNode;

    public ListNode(Object item) {
        data = item;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object item) {
        data = item;
    }
}

