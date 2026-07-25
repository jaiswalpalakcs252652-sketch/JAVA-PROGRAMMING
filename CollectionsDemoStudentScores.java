package collectionsdemostudentscores;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List; 
import java.util.Set; 
import java.util.Map; 
import java.util.Iterator;

public class CollectionsDemoStudentScores {
    public static void main(String[] args) {
        System.out.println("DEMONSTRATING  MAP  INTERFACE");
        Map<String, Integer> studentscores = new HashMap<>();
        studentscores.put("Alice", 95); 
        studentscores.put("Bob", 88);
        studentscores.put("Charlie", 76);
        studentscores.put("Alice", 98); 
        System.out.println("Initial Map: " + studentscores);
        System.out.println("Bob's score: " + studentscores.get("Bob")); 
        studentscores.remove("Charlie"); 
        System.out.println("Map after removing Charlie: " + studentscores);
        System.out.println("Does map contain key Bob? " + studentscores.containsKey("Bob")); 
        System.out.println("Does map contain value 98? " + studentscores.containsValue(98)); 
        System.out.println("Keys in the map: " + studentscores.keySet()); 
        System.out.println("Values in the map: " + studentscores.values()); 
        System.out.println("Entries in the map: " + studentscores.entrySet()); 
        System.out.println("Size of the map: " + studentscores.size()); 
        studentscores.clear(); // clear()
        System.out.println("Map after clearing: " + studentscores);
    }
}
