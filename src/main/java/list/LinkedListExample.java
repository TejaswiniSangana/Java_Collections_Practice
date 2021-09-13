package list;

import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {
        List<Integer> uid = new LinkedList<>();
        uid.add(56874);
        uid.add(24567);
        uid.add(33215);
        System.out.println("Initial elements of LinkedList are:");
        Iterator<Integer> iterator = uid.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        Collections.sort(uid);
        System.out.println("Elements after sorting LinkedList are:");
        ListIterator<Integer> listIterator = uid.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
        System.out.println("Reversing the LinkedList:");
        ListIterator<Integer> listIterator1 = uid.listIterator(uid.size());
        while (listIterator1.hasPrevious()) {
            System.out.println(listIterator1.previous());
        }
        uid.remove(1);
        uid.set(0,44721);
        uid.add(1,67522);
        System.out.println("Elements after performing some operations on LinkedList are:");
        for(Integer id: uid){
            System.out.println(id);
        }
        uid.clear();
        System.out.println("LinkedList after clearing:"+ uid);

    }
}
