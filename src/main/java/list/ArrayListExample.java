package list;

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ram");
        names.add("Anup");
        names.add("Sita");
        names.add("Gita");
        System.out.println("Initial elements of ArrayList are:");
        Iterator<String> iterator= names.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("ArrayList after sorting elements:");
        Collections.sort(names);
        for(int i=0;i< names.size();i++){
            System.out.println(names.get(i));
        }
        names.set(2, "John");
        names.set(3,"Radha");
        names.add(2,"Krish");
        names.remove(0);
        System.out.println("ArrayList after changing some elements:");
        for(String name:names){
            System.out.println(name);
        }
        System.out.println("Sublist of the Arrarylist:");
        System.out.println(names.subList(0, names.size()-1));
    }
}
