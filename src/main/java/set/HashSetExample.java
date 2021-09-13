package set;

import java.util.*;

public class HashSetExample {
    public static void main(String[] args){
        Set<String> names= new HashSet<>();
        names.add("ram");
        names.add("raju");
        names.add("ajay");
        names.add("raju");
        System.out.println("Intial elements of Hashset:");
        for(String name:names){
            System.out.println(name);
        }
        names.addAll(Arrays.asList(new String[]{"vijay","sita","gita"}));
        System.out.println("Elements of hashset after using addAll:");
        for(String name:names){
            System.out.println(name);
        }
        names.removeIf(str->str.contains("jay"));
        System.out.println("Elements of Hashset after deleting names having substring \"jay\":");
        Iterator<String> iterator= names.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        names.clear();
        System.out.println("Hashset after clearing:"+names );
    }

}
