package set;

import java.util.*;

public class TreeSetExample {
    public static void main(String[] args){
        TreeSet<String> states = new TreeSet<>();
        states.add("Sikkim");
        states.add("Kerala");
        states.addAll(states);
        states.add("Punjab");
        states.add("Gujarat");
        System.out.println("Intial elements of Treeset:");
        for(String state:states){
            System.out.println(state);
        }
        System.out.println("Reverse Set:"+states.descendingSet());
        System.out.println("First Elemnt of Set:"+states.pollFirst());
        System.out.println("Last Elemnt of Set:"+states.pollLast());
        System.out.println("Traversing using the iterator");
        Iterator<String> iterator= states.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
