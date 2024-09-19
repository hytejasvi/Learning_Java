package Collections.ListInterfaceExamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {
    public static void main(String[] args) {
        List<Integer> al1 = new ArrayList<>();
        List<Integer> al2 = new ArrayList<>();
        al2.add(1);
        al2.add(2);
        al2.add(3);
        //exploring few available methods of list interface and ArrayList class
        al1.add(10);// adding element to arrayList
        al1.add(1,20); //adding element at a particular index
        al1.add(1,30); //adding element at a particular index, it moves all the elements further
        al1.get(2); // returns the element at the specified index
        al1.addAll(al2); //adds all the element of al2 list to al1: appends in the end
        for (int i : al1) {
            System.out.print(i+" ");
        }
        System.out.println("al1.containsAll(al2): "+al1.containsAll(al2)); //checks and returns boolean if all
        //the element of the second list are present in teh first list
        al1.addAll(2,al2); //inserts the second list at the specified pos and pushes the current contents
        for (int i : al1) {
            System.out.print(i+" ");
        }
        System.out.println("al1.lastIndexOf(1): "+al1.lastIndexOf(1)); //searches for the element from end(last index)
        System.out.println("al1.indexOf(1): "+al1.indexOf(1));//searches for the element from start (0 index)
        al1.removeAll(al2); //Removes all the elements of the 2nd list present in teh 1st list
        for (int i : al1) {
            System.out.print(i+" ");
        }
        System.out.println();
        al1.addAll(1, al2);
        al1.addAll(al2);
        for (int i : al1) {
            System.out.print(i+" ");
        }
        System.out.println();
        al1.retainAll(al2); // keeps only elements of al2 in al1 and removes everything else
        for (int i : al1) {
            System.out.print(i+" ");
        }
        System.out.println();
        Iterator<Integer> itr = al1.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next()+" ");
        }
        System.out.println();
        ListIterator<Integer> it = al1.listIterator();
        //ListIterator is similar to iterator but with added functionalities like moving backwards to previous
        // it also gives previous index and next index
        it.nextIndex(); //Returns the index of the element that would be returned by next() call.
        while (it.hasNext()) {
            System.out.print(it.next()+" ");
        }
        System.out.println();
    }
}
