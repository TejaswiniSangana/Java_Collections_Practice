package set;
import java.util.*;

public class LinkedHashSetExample {
    public static void main(String[] args){
        Set<Integer> uid = new LinkedHashSet<>();
        uid.add(7465);
        uid.add(1875);
        uid.add(8432);
        uid.addAll(Arrays.asList(new Integer[]{7465,5462,6754,2876}));
        System.out.println("Intial elements of LinkedHashset:");
        for(Integer id:uid){
            System.out.println(id);
        }
        if(uid.containsAll(Arrays.asList(new Integer[]{7465,2876}))){
            uid.removeAll(Arrays.asList(new Integer[]{7465,2876}));
        }
        System.out.println("Elements after removing elements:");
        Iterator<Integer> itr= uid.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

}
