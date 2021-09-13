package map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args){
        Map<Integer,String> names =new TreeMap<>();
        names.put(1,"Anup");
        names.put(5,"Jay");
        names.putIfAbsent(2, "Gita");
        System.out.println("Elements of TreeMap are");
        for(Map.Entry<Integer,String> name : names.entrySet()){
            System.out.println("State:"+ name.getKey()+" Capital:"+ name.getValue());
        }
        names.put(1,"Ravi");
        names.remove(2);
        Map<Integer,String> names1 =new TreeMap<>();
        names1.put(8,"Ansh");
        names1.put(4,"Seema");
        names.putAll(names1);
        System.out.println("Tree Map after performing certain operations:");
        for(Map.Entry<Integer,String> name : names.entrySet()){
            System.out.println("State:"+ name.getKey()+" Capital:"+ name.getValue());
        }
    }
}
