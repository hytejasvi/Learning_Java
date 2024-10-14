package Collections.LinkedList;

import java.util.LinkedList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertLast(5);
        list.insertFirst(1);
        list.displayList();
        System.out.println("list size: "+list.size());
        list.insertAtIndex(30, 2);
        list.displayList();
        System.out.println("list size: "+list.size());
        list.deleteFirst();
        list.displayList();
        System.out.println("list size: "+list.size());
        list.deleteLast();
        list.displayList();
        System.out.println("list size: "+list.size());
    }
}
