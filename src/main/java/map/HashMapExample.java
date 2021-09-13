package map;

import java.util.*;

public class HashMapExample {
    public static void main(String[] args){
        Map<String,String> capitals = new HashMap<>();
        capitals.put("Telangana", "Hyderabad");
        capitals.put("Maharashtra","Mumbai");
        capitals.put("Tamil Nadu", "Chennai");
        capitals.putIfAbsent("Karnataka", "Bengaluru");
        System.out.println("Elements of HashMap are");
        for(Map.Entry<String,String> capital: capitals.entrySet()){
            System.out.println("State:"+capital.getKey()+" Capital:"+capital.getValue());
        }
        capitals.replace("Karnataka", "Bengaluru", "Bangalore");
        if(capitals.containsKey("Telangana")){
            capitals.remove("Telangana");
        }
        System.out.println("Key  are:"+capitals.keySet());
        System.out.println("values are:"+capitals.values());
    }
}
