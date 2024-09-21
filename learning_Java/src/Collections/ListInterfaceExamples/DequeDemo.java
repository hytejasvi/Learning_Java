package Collections.ListInterfaceExamples;

import java.util.ArrayDeque;

public class DequeDemo {
    public static void main(String[] args) {
        /*ArrayDeque <Integer> ad = new ArrayDeque<>();
        ad.addLast(10); //Inserts the specified element at the end of this deque. cannot add null value
        ad.offerLast(20);//Inserts the specified element at the end of this deque. cannot add null value
        ad.offerLast(30);
        ad.offerLast(40);
        //the above inserts the element at the end
        System.out.println(ad);

        ad.offerFirst(1);
        ad.offerFirst(2);
        ad.offerFirst(3);
        ad.offerFirst(4);
        //the above inserts the element at the start
        System.out.println(ad);*/
        ArrayDeque <Integer> stackImpl = new ArrayDeque<>(1);
        ArrayDeque <Integer> queueImpl = new ArrayDeque<>(1);

        stackImplementationUsingArrayDeque(stackImpl); //Follows LIFO style
        queueImplementationUsingArrayDeque(queueImpl); // Follows FIFO
    }

    private static void queueImplementationUsingArrayDeque(ArrayDeque<Integer> queueImpl) {
        //In queue implementation, we add from rear end and remove from first end : FIFO
        //offerLast is same as addLast, but if the operation fails, this returns false instead of throwing exception
        queueImpl.offerLast(1);
        queueImpl.offerLast(2);
        queueImpl.offerLast(3);
        queueImpl.offerLast(4);
        queueImpl.offerLast(5);
        System.out.println("Elements added to queue");
        System.out.println(queueImpl);
        //queueImpl.removeFirst();// can be used to remove the first element
        //queueImpl.remove();// can be used to remove the first element, if it is empty then it throws exception
        //System.out.println(queueImpl.peekLast()); //gets the last element, but does not remove it from the list
        queueImpl.pollFirst(); //removes the first element, and if dqueue is empty, then returns null
        System.out.println(queueImpl);

    }

    private static void stackImplementationUsingArrayDeque(ArrayDeque<Integer> stackImpl) {
        stackImpl.offerLast(10);
        stackImpl.offerLast(20);
        stackImpl.offerLast(30);
        System.out.println("inside stackImpl");
        System.out.println(stackImpl);
        stackImpl.pollLast();//removes the last element of the dequeue
        System.out.println(stackImpl);
    }

}
