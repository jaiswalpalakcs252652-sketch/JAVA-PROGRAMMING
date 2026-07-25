package collectionsdemouniquecolors;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List; 
import java.util.Set; 
import java.util.Map; 
import java.util.Iterator;

public class CollectionsDemoUniqueColors {
    public static void main(String[] args) {
        System.out.println("DEMONSTRATING  SET  INTERFACE");
        Set<String> uniquecolors = new HashSet<>();
        uniquecolors.add("Red");
        uniquecolors.add("Green");
        uniquecolors.add("Blue");
        uniquecolors.add("Red");
        System.out.println("Initial Set : " + uniquecolors);
        uniquecolors.remove("Green");
        System.out.println("Set after removing Green: " + uniquecolors);
        System.out.println("Does set contain Blue? " + uniquecolors.contains("Blue"));
        System.out.println("Size of the set: " + uniquecolors.size());
        System.out.println("Is the set empty? " + uniquecolors.isEmpty()); 
        System.out.print("Iterating over the set: ");
        Iterator<String> iterator = uniquecolors.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        Set<String> moreColors = new HashSet<>();
        moreColors.add("Yellow");
        moreColors.add("Blue");
        uniquecolors.addAll(moreColors); 
        System.out.println("Set after adding more colors: " + uniquecolors);
    }
}
