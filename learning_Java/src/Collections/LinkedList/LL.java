package Collections.LinkedList;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size=0;
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }
    
    public void insertLast(int value) {
        if (tail== null) {
            insertFirst(value);
        } else {
            Node node = new Node(value);
            tail.next = node;
            tail = node;
            size++;
        }
    }

    public void insertAtIndex(int value, int index) {
        if (index == 0) {
            insertFirst(value);
        } else if (index == size) {
            insertLast(value);
        } else {
            Node temp = head;
            int counter=1;
            while (counter < (index-1) && temp!= null) {
                temp = temp.next;
                counter++;
            }
            Node node = new Node(value, temp.next);
            temp.next = node;
            size++;
        }
    }

    public void deleteFirst() {
        head = head.next;
        if (head == null) {
            tail = head;
        }
        size = size-1;
    }

    public void deleteLast() {
        if (head == tail) {
            deleteFirst();
        } else {
            int count = 1;
            Node temp = head;
            while (count < size-1 ) {
                temp = temp.next;
                count++;
            }
            temp.next = null;
            size--;
        }
    }

    public int size() {
        return this.size;
    }

    public void displayList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value +" --> ");
            temp = temp.next;
        }
        System.out.println();
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
