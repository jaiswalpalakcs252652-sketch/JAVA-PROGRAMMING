package collectionsdemo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List; 
import java.util.Set; 
import java.util.Map; 
import java.util.Iterator;

public class CollectionsDemo {
    public static void main(String[] args) {
        System.out.println("DEMONSTRATING  LIST  INTERFACE");
        List<String>fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple");
        System.out.println("Initial List : " + fruits);
        fruits.add(1, "Grape");
        System.out.println("List after adding Grape at index 1 : " + fruits);
        System.out.println("First fruit : " + fruits.get(0));
        fruits.set(2, "Mango");
        System.out.println("List after updating element at index 2 to Mango : " + fruits);
        fruits.remove("Apple");
        System.out.println("List after removing the first Apple: " + fruits);
        fruits.remove(fruits.size() - 1);
        System.out.println("List after removing the last element: " + fruits);
        System.out.println("Index of Orange: " + fruits.indexOf("Orange"));
        System.out.println("Does list contain Banana? " + fruits.contains("Banana"));
        System.out.println("Size of the list: " + fruits.size()); 
        fruits.clear();
        System.out.println("List after clearing: " + fruits); 
    }
   
}
